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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Upload, download and manage files, folders, groups, collaborations, etc on
 * Dropbox.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DropboxEndpointBuilderFactory {

    /**
     * Builder for endpoint consumers for the Dropbox component.
     */
    public interface DropboxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDropboxEndpointConsumerBuilder advanced() {
            return (AdvancedDropboxEndpointConsumerBuilder) this;
        }
        /**
         * Name of the app registered to make API requests.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param clientIdentifier the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder clientIdentifier(String clientIdentifier) {
            doSetProperty("clientIdentifier", clientIdentifier);
            return this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Original file or folder to move.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The apiKey to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param apiKey the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder apiKey(String apiKey) {
            doSetProperty("apiKey", apiKey);
            return this;
        }
        /**
         * The apiSecret to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param apiSecret the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder apiSecret(String apiSecret) {
            doSetProperty("apiSecret", apiSecret);
            return this;
        }
        /**
         * The expire time to access token for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param expireIn the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder expireIn(Long expireIn) {
            doSetProperty("expireIn", expireIn);
            return this;
        }
        /**
         * The expire time to access token for a specific Dropbox user.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param expireIn the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder expireIn(String expireIn) {
            doSetProperty("expireIn", expireIn);
            return this;
        }
        /**
         * The refresh token to refresh the access token for a specific Dropbox
         * user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param refreshToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointConsumerBuilder refreshToken(String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Dropbox component.
     */
    public interface AdvancedDropboxEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DropboxEndpointConsumerBuilder basic() {
            return (DropboxEndpointConsumerBuilder) this;
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder bridgeErrorHandler(String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder exceptionHandler(org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder exceptionHandler(String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder exchangePattern(org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder exchangePattern(String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * To use an existing DbxClient instance as Dropbox client.
         * 
         * The option is a: <code>com.dropbox.core.v2.DbxClientV2</code> type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder client(com.dropbox.core.v2.DbxClientV2 client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use an existing DbxClient instance as Dropbox client.
         * 
         * The option will be converted to a
         * <code>com.dropbox.core.v2.DbxClientV2</code> type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointConsumerBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Dropbox component.
     */
    public interface DropboxEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDropboxEndpointProducerBuilder advanced() {
            return (AdvancedDropboxEndpointProducerBuilder) this;
        }

        /**
         * Name of the app registered to make API requests.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param clientIdentifier the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder clientIdentifier(String clientIdentifier) {
            doSetProperty("clientIdentifier", clientIdentifier);
            return this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Original file or folder to move.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * Optional folder or file to upload on Dropbox from the local
         * filesystem. If this option has not been configured then the message
         * body is used as the content to upload.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param localPath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder localPath(String localPath) {
            doSetProperty("localPath", localPath);
            return this;
        }
        /**
         * Destination file or folder.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param newRemotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder newRemotePath(String newRemotePath) {
            doSetProperty("newRemotePath", newRemotePath);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option is a:
         * <code>org.apache.camel.component.dropbox.util.DropboxUploadMode</code> type.
         * 
         * Group: producer
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder uploadMode(org.apache.camel.component.dropbox.util.DropboxUploadMode uploadMode) {
            doSetProperty("uploadMode", uploadMode);
            return this;
        }
        /**
         * Which mode to upload. in case of add the new file will be renamed if
         * a file with the same name already exists on dropbox. in case of force
         * if a file with the same name already exists on dropbox, this will be
         * overwritten.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.dropbox.util.DropboxUploadMode</code> type.
         * 
         * Group: producer
         * 
         * @param uploadMode the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder uploadMode(String uploadMode) {
            doSetProperty("uploadMode", uploadMode);
            return this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The apiKey to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param apiKey the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder apiKey(String apiKey) {
            doSetProperty("apiKey", apiKey);
            return this;
        }
        /**
         * The apiSecret to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param apiSecret the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder apiSecret(String apiSecret) {
            doSetProperty("apiSecret", apiSecret);
            return this;
        }
        /**
         * The expire time to access token for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param expireIn the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder expireIn(Long expireIn) {
            doSetProperty("expireIn", expireIn);
            return this;
        }
        /**
         * The expire time to access token for a specific Dropbox user.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param expireIn the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder expireIn(String expireIn) {
            doSetProperty("expireIn", expireIn);
            return this;
        }
        /**
         * The refresh token to refresh the access token for a specific Dropbox
         * user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param refreshToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointProducerBuilder refreshToken(String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Dropbox component.
     */
    public interface AdvancedDropboxEndpointProducerBuilder extends EndpointProducerBuilder {
        default DropboxEndpointProducerBuilder basic() {
            return (DropboxEndpointProducerBuilder) this;
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointProducerBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointProducerBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use an existing DbxClient instance as Dropbox client.
         * 
         * The option is a: <code>com.dropbox.core.v2.DbxClientV2</code> type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointProducerBuilder client(com.dropbox.core.v2.DbxClientV2 client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use an existing DbxClient instance as Dropbox client.
         * 
         * The option will be converted to a
         * <code>com.dropbox.core.v2.DbxClientV2</code> type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointProducerBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Dropbox component.
     */
    public interface DropboxEndpointBuilder
            extends
                DropboxEndpointConsumerBuilder,
                DropboxEndpointProducerBuilder {
        default AdvancedDropboxEndpointBuilder advanced() {
            return (AdvancedDropboxEndpointBuilder) this;
        }

        /**
         * Name of the app registered to make API requests.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param clientIdentifier the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder clientIdentifier(String clientIdentifier) {
            doSetProperty("clientIdentifier", clientIdentifier);
            return this;
        }
        /**
         * A space-separated list of sub-strings to search for. A file matches
         * only if it contains all the sub-strings. If this option is not set,
         * all files will be matched.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param query the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder query(String query) {
            doSetProperty("query", query);
            return this;
        }
        /**
         * Original file or folder to move.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         * 
         * @param remotePath the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder remotePath(String remotePath) {
            doSetProperty("remotePath", remotePath);
            return this;
        }
        /**
         * The access token to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param accessToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder accessToken(String accessToken) {
            doSetProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The apiKey to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param apiKey the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder apiKey(String apiKey) {
            doSetProperty("apiKey", apiKey);
            return this;
        }
        /**
         * The apiSecret to make API requests for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param apiSecret the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder apiSecret(String apiSecret) {
            doSetProperty("apiSecret", apiSecret);
            return this;
        }
        /**
         * The expire time to access token for a specific Dropbox user.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param expireIn the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder expireIn(Long expireIn) {
            doSetProperty("expireIn", expireIn);
            return this;
        }
        /**
         * The expire time to access token for a specific Dropbox user.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param expireIn the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder expireIn(String expireIn) {
            doSetProperty("expireIn", expireIn);
            return this;
        }
        /**
         * The refresh token to refresh the access token for a specific Dropbox
         * user.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: security
         * 
         * @param refreshToken the value to set
         * @return the dsl builder
         */
        default DropboxEndpointBuilder refreshToken(String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Dropbox component.
     */
    public interface AdvancedDropboxEndpointBuilder
            extends
                AdvancedDropboxEndpointConsumerBuilder,
                AdvancedDropboxEndpointProducerBuilder {
        default DropboxEndpointBuilder basic() {
            return (DropboxEndpointBuilder) this;
        }

        /**
         * To use an existing DbxClient instance as Dropbox client.
         * 
         * The option is a: <code>com.dropbox.core.v2.DbxClientV2</code> type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointBuilder client(com.dropbox.core.v2.DbxClientV2 client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * To use an existing DbxClient instance as Dropbox client.
         * 
         * The option will be converted to a
         * <code>com.dropbox.core.v2.DbxClientV2</code> type.
         * 
         * Group: advanced
         * 
         * @param client the value to set
         * @return the dsl builder
         */
        default AdvancedDropboxEndpointBuilder client(String client) {
            doSetProperty("client", client);
            return this;
        }
    }

    public interface DropboxBuilders {
        /**
         * Dropbox (camel-dropbox)
         * Upload, download and manage files, folders, groups, collaborations,
         * etc on Dropbox.
         * 
         * Category: cloud,file,api
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-dropbox
         * 
         * @return the dsl builder for the headers' name.
         */
        default DropboxHeaderNameBuilder dropbox() {
            return DropboxHeaderNameBuilder.INSTANCE;
        }
        /**
         * Dropbox (camel-dropbox)
         * Upload, download and manage files, folders, groups, collaborations,
         * etc on Dropbox.
         * 
         * Category: cloud,file,api
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-dropbox
         * 
         * Syntax: <code>dropbox:operation</code>
         * 
         * Path parameter: operation (required)
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder.
         * There are 5 enums and the value can be one of: put, del, search, get,
         * move
         * 
         * @param path operation
         * @return the dsl builder
         */
        default DropboxEndpointBuilder dropbox(String path) {
            return DropboxEndpointBuilderFactory.endpointBuilder("dropbox", path);
        }
        /**
         * Dropbox (camel-dropbox)
         * Upload, download and manage files, folders, groups, collaborations,
         * etc on Dropbox.
         * 
         * Category: cloud,file,api
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-dropbox
         * 
         * Syntax: <code>dropbox:operation</code>
         * 
         * Path parameter: operation (required)
         * The specific action (typically is a CRUD action) to perform on
         * Dropbox remote folder.
         * There are 5 enums and the value can be one of: put, del, search, get,
         * move
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default DropboxEndpointBuilder dropbox(String componentName, String path) {
            return DropboxEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the Dropbox component.
     */
    public static class DropboxHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final DropboxHeaderNameBuilder INSTANCE = new DropboxHeaderNameBuilder();

        /**
         * The remote path.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: all
         * 
         * @return the name of the header {@code DropboxRemotePath}.
         */
        public String dropboxRemotePath() {
            return "CamelDropboxRemotePath";
        }
        /**
         * The new remote path.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: move
         * 
         * @return the name of the header {@code DropboxNewRemotePath}.
         */
        public String dropboxNewRemotePath() {
            return "CamelDropboxNewRemotePath";
        }
        /**
         * The local path.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: put
         * 
         * @return the name of the header {@code DropboxLocalPath}.
         */
        public String dropboxLocalPath() {
            return "CamelDropboxLocalPath";
        }
        /**
         * The upload mode.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: put
         * 
         * @return the name of the header {@code DropboxUploadMode}.
         */
        public String dropboxUploadMode() {
            return "CamelDropboxUploadMode";
        }
        /**
         * The query.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: search
         * 
         * @return the name of the header {@code DropboxQuery}.
         */
        public String dropboxQuery() {
            return "CamelDropboxQuery";
        }
        /**
         * The name of the file to upload.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: put
         * 
         * @return the name of the header {@code DropboxPutFileName}.
         */
        public String dropboxPutFileName() {
            return "CamelDropboxPutFileName";
        }
        /**
         * In case of single file download, path of the remote file downloaded.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: get
         * 
         * @return the name of the header {@code DOWNLOADED_FILE}.
         */
        public String downloadedFile() {
            return "DOWNLOADED_FILE";
        }
        /**
         * In case of multiple files download, path of the remote files
         * downloaded.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: get
         * 
         * @return the name of the header {@code DOWNLOADED_FILES}.
         */
        public String downloadedFiles() {
            return "DOWNLOADED_FILES";
        }
        /**
         * In case of single file upload, path of the remote path uploaded.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: put
         * 
         * @return the name of the header {@code UPLOADED_FILE}.
         */
        public String uploadedFile() {
            return "UPLOADED_FILE";
        }
        /**
         * In case of multiple files upload, string with the remote paths
         * uploaded.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: put
         * 
         * @return the name of the header {@code UPLOADED_FILES}.
         */
        public String uploadedFiles() {
            return "UPLOADED_FILES";
        }
        /**
         * List of file path founded.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: search
         * 
         * @return the name of the header {@code FOUND_FILES}.
         */
        public String foundFiles() {
            return "FOUND_FILES";
        }
        /**
         * Name of the path deleted on dropbox.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: del
         * 
         * @return the name of the header {@code DELETED_PATH}.
         */
        public String deletedPath() {
            return "DELETED_PATH";
        }
        /**
         * Name of the path moved on dropbox.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: move
         * 
         * @return the name of the header {@code MOVED_PATH}.
         */
        public String movedPath() {
            return "MOVED_PATH";
        }
    }
    static DropboxEndpointBuilder endpointBuilder(String componentName, String path) {
        class DropboxEndpointBuilderImpl extends AbstractEndpointBuilder implements DropboxEndpointBuilder, AdvancedDropboxEndpointBuilder {
            public DropboxEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DropboxEndpointBuilderImpl(path);
    }
}