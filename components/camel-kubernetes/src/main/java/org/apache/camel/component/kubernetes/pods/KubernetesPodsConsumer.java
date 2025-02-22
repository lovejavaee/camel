/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.kubernetes.pods;

import java.util.concurrent.ExecutorService;

import io.fabric8.kubernetes.api.model.Pod;
import io.fabric8.kubernetes.api.model.PodList;
import io.fabric8.kubernetes.client.Watch;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.kubernetes.client.WatcherException;
import io.fabric8.kubernetes.client.dsl.FilterWatchListDeletable;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.PodResource;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.kubernetes.AbstractKubernetesEndpoint;
import org.apache.camel.component.kubernetes.KubernetesConstants;
import org.apache.camel.component.kubernetes.KubernetesHelper;
import org.apache.camel.support.DefaultConsumer;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KubernetesPodsConsumer extends DefaultConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(KubernetesPodsConsumer.class);

    private final Processor processor;
    private ExecutorService executor;
    private PodsConsumerTask podsWatcher;

    public KubernetesPodsConsumer(AbstractKubernetesEndpoint endpoint, Processor processor) {
        super(endpoint, processor);
        this.processor = processor;
    }

    @Override
    public AbstractKubernetesEndpoint getEndpoint() {
        return (AbstractKubernetesEndpoint) super.getEndpoint();
    }

    @Override
    protected void doStart() throws Exception {
        super.doStart();
        executor = getEndpoint().createExecutor();

        podsWatcher = new PodsConsumerTask();
        executor.submit(podsWatcher);
    }

    @Override
    protected void doStop() throws Exception {
        super.doStop();

        LOG.debug("Stopping Kubernetes Pods Consumer");
        if (executor != null) {
            KubernetesHelper.close(podsWatcher, podsWatcher::getWatch);

            if (getEndpoint() != null && getEndpoint().getCamelContext() != null) {
                getEndpoint().getCamelContext().getExecutorServiceManager().shutdownNow(executor);
            } else {
                executor.shutdownNow();
            }
        }
        executor = null;
    }

    class PodsConsumerTask implements Runnable {

        private Watch watch;

        @Override
        public void run() {
            FilterWatchListDeletable<Pod, PodList, PodResource> w;

            /*
                Valid options are (according to how the client can be constructed):
                - inAnyNamespace
                - inAnyNamespace + withLabel
                - inNamespace
                - inNamespace + withLabel
                - inNamespace + withName
             */
            String namespace = getEndpoint().getKubernetesConfiguration().getNamespace();
            String labelKey = getEndpoint().getKubernetesConfiguration().getLabelKey();
            String labelValue = getEndpoint().getKubernetesConfiguration().getLabelValue();
            String resourceName = getEndpoint().getKubernetesConfiguration().getResourceName();

            if (ObjectHelper.isEmpty(namespace)) {
                w = getEndpoint().getKubernetesClient().pods().inAnyNamespace();

                if (ObjectHelper.isNotEmpty(labelKey) && ObjectHelper.isNotEmpty(labelValue)) {
                    w = w.withLabel(labelKey, labelValue);
                }
            } else {
                final NonNamespaceOperation<Pod, PodList, PodResource> client
                        = getEndpoint().getKubernetesClient().pods().inNamespace(namespace);
                w = client;
                if (ObjectHelper.isNotEmpty(labelKey) && ObjectHelper.isNotEmpty(labelValue)) {
                    w = client.withLabel(labelKey, labelValue);
                } else if (ObjectHelper.isNotEmpty(resourceName)) {
                    w = (FilterWatchListDeletable<Pod, PodList, PodResource>) client.withName(resourceName);
                }
            }

            watch = w.watch(new Watcher<>() {

                @Override
                public void eventReceived(Action action, Pod resource) {
                    Exchange exchange = createExchange(false);
                    exchange.getIn().setBody(resource);
                    exchange.getIn().setHeader(KubernetesConstants.KUBERNETES_EVENT_ACTION, action);
                    exchange.getIn().setHeader(KubernetesConstants.KUBERNETES_EVENT_TIMESTAMP, System.currentTimeMillis());
                    try {
                        processor.process(exchange);
                    } catch (Exception e) {
                        getExceptionHandler().handleException("Error during processing", exchange, e);
                    } finally {
                        releaseExchange(exchange, false);
                    }
                }

                @Override
                public void onClose(WatcherException cause) {
                    if (cause != null) {
                        LOG.error(cause.getMessage(), cause);
                    }

                }
            });
        }

        public Watch getWatch() {
            return watch;
        }

        public void setWatch(Watch watch) {
            this.watch = watch;
        }
    }
}
