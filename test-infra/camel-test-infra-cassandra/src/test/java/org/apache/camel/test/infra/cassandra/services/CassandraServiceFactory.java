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
package org.apache.camel.test.infra.cassandra.services;

import org.apache.camel.test.infra.common.services.SimpleTestServiceBuilder;

public final class CassandraServiceFactory {
    private CassandraServiceFactory() {

    }

    public static SimpleTestServiceBuilder<CassandraService> builder() {
        return new SimpleTestServiceBuilder<>("cassandra");
    }

    public static CassandraService createLocalService(String initScript) {
        CassandraLocalContainerService service = new CassandraLocalContainerService();
        service.getContainer()
                .withInitScript(initScript)
                .withNetworkAliases("cassandra");

        return service;
    }

    public static CassandraService createService() {
        return builder()
                .addLocalMapping(CassandraLocalContainerService::new)
                .addRemoteMapping(RemoteCassandraService::new)
                .build();
    }

    public static class RemoteCassandraService extends RemoteCassandraInfraService implements CassandraService {
    }
}
