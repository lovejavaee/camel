/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.google.pubsub.GooglePubsubComponent;

/**
 * Send and receive messages to/from Google Cloud Platform PubSub Service.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GooglePubsubComponentBuilderFactory {

    /**
     * Google Pubsub (camel-google-pubsub)
     * Send and receive messages to/from Google Cloud Platform PubSub Service.
     * 
     * Category: cloud,messaging
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-google-pubsub
     * 
     * @return the dsl builder
     */
    static GooglePubsubComponentBuilder googlePubsub() {
        return new GooglePubsubComponentBuilderImpl();
    }

    /**
     * Builder for the Google Pubsub component.
     */
    interface GooglePubsubComponentBuilder extends ComponentBuilder<GooglePubsubComponent> {
    
        
        /**
         * Use Credentials when interacting with PubSub service (no
         * authentication is required when using emulator).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param authenticate the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder authenticate(boolean authenticate) {
            doSetProperty("authenticate", authenticate);
            return this;
        }
    
        /**
         * Endpoint to use with local Pub/Sub emulator.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder endpoint(java.lang.String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
    
        /**
         * The Service account key that can be used as credentials for the
         * PubSub publisher/subscriber. It can be loaded by default from
         * classpath, but you can prefix with classpath:, file:, or http: to
         * load the resource from different systems.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param serviceAccountKey the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder serviceAccountKey(java.lang.String serviceAccountKey) {
            doSetProperty("serviceAccountKey", serviceAccountKey);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        /**
         * Comma-separated list of additional retryable error codes for
         * synchronous pull. By default the PubSub client library retries
         * ABORTED, UNAVAILABLE, UNKNOWN.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param synchronousPullRetryableCodes the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder synchronousPullRetryableCodes(java.lang.String synchronousPullRetryableCodes) {
            doSetProperty("synchronousPullRetryableCodes", synchronousPullRetryableCodes);
            return this;
        }
    
        
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        /**
         * Maximum number of producers to cache. This could be increased if you
         * have producers for lots of different topics.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param publisherCacheSize the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder publisherCacheSize(int publisherCacheSize) {
            doSetProperty("publisherCacheSize", publisherCacheSize);
            return this;
        }
    
        /**
         * How many milliseconds should each producer stay alive in the cache.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param publisherCacheTimeout the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder publisherCacheTimeout(int publisherCacheTimeout) {
            doSetProperty("publisherCacheTimeout", publisherCacheTimeout);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * How many milliseconds should a producer be allowed to terminate.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param publisherTerminationTimeout the value to set
         * @return the dsl builder
         */
        default GooglePubsubComponentBuilder publisherTerminationTimeout(int publisherTerminationTimeout) {
            doSetProperty("publisherTerminationTimeout", publisherTerminationTimeout);
            return this;
        }
    }

    class GooglePubsubComponentBuilderImpl
            extends AbstractComponentBuilder<GooglePubsubComponent>
            implements GooglePubsubComponentBuilder {
        @Override
        protected GooglePubsubComponent buildConcreteComponent() {
            return new GooglePubsubComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "authenticate": ((GooglePubsubComponent) component).setAuthenticate((boolean) value); return true;
            case "endpoint": ((GooglePubsubComponent) component).setEndpoint((java.lang.String) value); return true;
            case "serviceAccountKey": ((GooglePubsubComponent) component).setServiceAccountKey((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((GooglePubsubComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "synchronousPullRetryableCodes": ((GooglePubsubComponent) component).setSynchronousPullRetryableCodes((java.lang.String) value); return true;
            case "lazyStartProducer": ((GooglePubsubComponent) component).setLazyStartProducer((boolean) value); return true;
            case "publisherCacheSize": ((GooglePubsubComponent) component).setPublisherCacheSize((int) value); return true;
            case "publisherCacheTimeout": ((GooglePubsubComponent) component).setPublisherCacheTimeout((int) value); return true;
            case "autowiredEnabled": ((GooglePubsubComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "publisherTerminationTimeout": ((GooglePubsubComponent) component).setPublisherTerminationTimeout((int) value); return true;
            default: return false;
            }
        }
    }
}