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
import org.apache.camel.component.mllp.MllpComponent;

/**
 * Communicate with external systems using the MLLP protocol.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MllpComponentBuilderFactory {

    /**
     * MLLP (camel-mllp)
     * Communicate with external systems using the MLLP protocol.
     * 
     * Category: health
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-mllp
     * 
     * @return the dsl builder
     */
    static MllpComponentBuilder mllp() {
        return new MllpComponentBuilderImpl();
    }

    /**
     * Builder for the MLLP component.
     */
    interface MllpComponentBuilder extends ComponentBuilder<MllpComponent> {
    
        
        /**
         * Enable/Disable the automatic generation of a MLLP Acknowledgement
         * MLLP Consumers only.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoAck the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder autoAck(boolean autoAck) {
            doSetProperty("autoAck", autoAck);
            return this;
        }
    
        /**
         * Sets the default charset to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param charsetName the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder charsetName(java.lang.String charsetName) {
            doSetProperty("charsetName", charsetName);
            return this;
        }
    
        /**
         * Sets the default configuration to use when creating MLLP endpoints.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.mllp.MllpConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder configuration(org.apache.camel.component.mllp.MllpConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    
        
        /**
         * Enable/Disable the automatic generation of message headers from the
         * HL7 Message MLLP Consumers only.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param hl7Headers the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder hl7Headers(boolean hl7Headers) {
            doSetProperty("hl7Headers", hl7Headers);
            return this;
        }
    
        
        /**
         * Enable/Disable strict compliance to the MLLP standard. The MLLP
         * standard specifies START_OF_BLOCKhl7 payloadEND_OF_BLOCKEND_OF_DATA,
         * however, some systems do not send the final END_OF_DATA byte. This
         * setting controls whether or not the final END_OF_DATA byte is
         * required or optional.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param requireEndOfData the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder requireEndOfData(boolean requireEndOfData) {
            doSetProperty("requireEndOfData", requireEndOfData);
            return this;
        }
    
        
        /**
         * Enable/Disable converting the payload to a String. If enabled, HL7
         * Payloads received from external systems will be validated converted
         * to a String. If the charsetName property is set, that character set
         * will be used for the conversion. If the charsetName property is not
         * set, the value of MSH-18 will be used to determine th appropriate
         * character set. If MSH-18 is not set, then the default ISO-8859-1
         * character set will be use.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param stringPayload the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder stringPayload(boolean stringPayload) {
            doSetProperty("stringPayload", stringPayload);
            return this;
        }
    
        
        /**
         * Enable/Disable the validation of HL7 Payloads If enabled, HL7
         * Payloads received from external systems will be validated (see
         * Hl7Util.generateInvalidPayloadExceptionMessage for details on the
         * validation). If and invalid payload is detected, a
         * MllpInvalidMessageException (for consumers) or a
         * MllpInvalidAcknowledgementException will be thrown.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param validatePayload the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder validatePayload(boolean validatePayload) {
            doSetProperty("validatePayload", validatePayload);
            return this;
        }
    
        
        /**
         * Timeout (in milliseconds) while waiting for a TCP connection TCP
         * Server Only.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 60000
         * Group: consumer
         * 
         * @param acceptTimeout the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder acceptTimeout(int acceptTimeout) {
            doSetProperty("acceptTimeout", acceptTimeout);
            return this;
        }
    
        
        /**
         * The maximum queue length for incoming connection indications (a
         * request to connect) is set to the backlog parameter. If a connection
         * indication arrives when the queue is full, the connection is refused.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 5
         * Group: consumer
         * 
         * @param backlog the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder backlog(java.lang.Integer backlog) {
            doSetProperty("backlog", backlog);
            return this;
        }
    
        
        /**
         * TCP Server Only - The number of milliseconds to wait between bind
         * attempts.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: consumer
         * 
         * @param bindRetryInterval the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder bindRetryInterval(int bindRetryInterval) {
            doSetProperty("bindRetryInterval", bindRetryInterval);
            return this;
        }
    
        
        /**
         * TCP Server Only - The number of milliseconds to retry binding to a
         * server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: consumer
         * 
         * @param bindTimeout the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder bindTimeout(int bindTimeout) {
            doSetProperty("bindTimeout", bindTimeout);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * receive incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. If disabled, the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions by logging them at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        
        /**
         * TCP Server Only - Allow the endpoint to start before the TCP
         * ServerSocket is bound. In some environments, it may be desirable to
         * allow the endpoint to start before the TCP ServerSocket is bound.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param lenientBind the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder lenientBind(boolean lenientBind) {
            doSetProperty("lenientBind", lenientBind);
            return this;
        }
    
        
        /**
         * The maximum number of concurrent MLLP Consumer connections that will
         * be allowed. If a new connection is received and the maximum is number
         * are already established, the new connection will be reset
         * immediately.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5
         * Group: consumer
         * 
         * @param maxConcurrentConsumers the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder maxConcurrentConsumers(int maxConcurrentConsumers) {
            doSetProperty("maxConcurrentConsumers", maxConcurrentConsumers);
            return this;
        }
    
        
        /**
         * Enable/disable the SO_REUSEADDR socket option.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param reuseAddress the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder reuseAddress(java.lang.Boolean reuseAddress) {
            doSetProperty("reuseAddress", reuseAddress);
            return this;
        }
    
        
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Default: InOut
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder exchangePattern(org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    
        
        /**
         * Timeout (in milliseconds) for establishing for a TCP connection TCP
         * Client only.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: producer
         * 
         * @param connectTimeout the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder connectTimeout(int connectTimeout) {
            doSetProperty("connectTimeout", connectTimeout);
            return this;
        }
    
        
        /**
         * decide what action to take when idle timeout occurs. Possible values
         * are : RESET: set SO_LINGER to 0 and reset the socket CLOSE: close the
         * socket gracefully default is RESET.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.mllp.MllpIdleTimeoutStrategy&lt;/code&gt; type.
         * 
         * Default: RESET
         * Group: producer
         * 
         * @param idleTimeoutStrategy the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder idleTimeoutStrategy(org.apache.camel.component.mllp.MllpIdleTimeoutStrategy idleTimeoutStrategy) {
            doSetProperty("idleTimeoutStrategy", idleTimeoutStrategy);
            return this;
        }
    
        
        /**
         * Enable/disable the SO_KEEPALIVE socket option.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param keepAlive the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder keepAlive(java.lang.Boolean keepAlive) {
            doSetProperty("keepAlive", keepAlive);
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
        default MllpComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Enable/disable the TCP_NODELAY socket option.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param tcpNoDelay the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder tcpNoDelay(java.lang.Boolean tcpNoDelay) {
            doSetProperty("tcpNoDelay", tcpNoDelay);
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
        default MllpComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        
        /**
         * Set the default character set to use for byte to/from String
         * conversions.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: ISO-8859-1
         * Group: advanced
         * 
         * @param defaultCharset the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder defaultCharset(java.lang.String defaultCharset) {
            doSetProperty("defaultCharset", defaultCharset);
            return this;
        }
    
        
        /**
         * Whether to log PHI.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param logPhi the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder logPhi(java.lang.Boolean logPhi) {
            doSetProperty("logPhi", logPhi);
            return this;
        }
    
        
        /**
         * Set the maximum number of bytes of PHI that will be logged in a log
         * entry.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 5120
         * Group: advanced
         * 
         * @param logPhiMaxBytes the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder logPhiMaxBytes(java.lang.Integer logPhiMaxBytes) {
            doSetProperty("logPhiMaxBytes", logPhiMaxBytes);
            return this;
        }
    
        
        /**
         * Maximum buffer size used when receiving or sending data over the
         * wire.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1073741824
         * Group: advanced
         * 
         * @param maxBufferSize the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder maxBufferSize(int maxBufferSize) {
            doSetProperty("maxBufferSize", maxBufferSize);
            return this;
        }
    
        
        /**
         * Minimum buffer size used when receiving or sending data over the
         * wire.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 2048
         * Group: advanced
         * 
         * @param minBufferSize the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder minBufferSize(int minBufferSize) {
            doSetProperty("minBufferSize", minBufferSize);
            return this;
        }
    
        
        /**
         * The SO_TIMEOUT value (in milliseconds) used after the start of an
         * MLLP frame has been received.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: advanced
         * 
         * @param readTimeout the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder readTimeout(int readTimeout) {
            doSetProperty("readTimeout", readTimeout);
            return this;
        }
    
        
        /**
         * Sets the SO_RCVBUF option to the specified value (in bytes).
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 8192
         * Group: advanced
         * 
         * @param receiveBufferSize the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder receiveBufferSize(java.lang.Integer receiveBufferSize) {
            doSetProperty("receiveBufferSize", receiveBufferSize);
            return this;
        }
    
        
        /**
         * The SO_TIMEOUT value (in milliseconds) used when waiting for the
         * start of an MLLP frame.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 15000
         * Group: advanced
         * 
         * @param receiveTimeout the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder receiveTimeout(int receiveTimeout) {
            doSetProperty("receiveTimeout", receiveTimeout);
            return this;
        }
    
        
        /**
         * Sets the SO_SNDBUF option to the specified value (in bytes).
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 8192
         * Group: advanced
         * 
         * @param sendBufferSize the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder sendBufferSize(java.lang.Integer sendBufferSize) {
            doSetProperty("sendBufferSize", sendBufferSize);
            return this;
        }
    
        /**
         * Sets the SSLContextParameters for securing TCP connections. If set,
         * the MLLP component will use SSL/TLS for securing both producer and
         * consumer TCP connections. This allows the configuration of trust
         * stores, key stores, protocols, and other SSL/TLS settings. If not
         * set, the MLLP component will use plain TCP communication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder sslContextParameters(org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
    
        
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useGlobalSslContextParameters the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder useGlobalSslContextParameters(boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    
        /**
         * The approximate idle time allowed before the Client TCP Connection
         * will be reset. A null value or a value less than or equal to zero
         * will disable the idle timeout.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: tcp
         * 
         * @param idleTimeout the value to set
         * @return the dsl builder
         */
        default MllpComponentBuilder idleTimeout(java.lang.Integer idleTimeout) {
            doSetProperty("idleTimeout", idleTimeout);
            return this;
        }
    }

    class MllpComponentBuilderImpl
            extends AbstractComponentBuilder<MllpComponent>
            implements MllpComponentBuilder {
        @Override
        protected MllpComponent buildConcreteComponent() {
            return new MllpComponent();
        }
        private org.apache.camel.component.mllp.MllpConfiguration getOrCreateConfiguration(MllpComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.mllp.MllpConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoAck": getOrCreateConfiguration((MllpComponent) component).setAutoAck((boolean) value); return true;
            case "charsetName": getOrCreateConfiguration((MllpComponent) component).setCharsetName((java.lang.String) value); return true;
            case "configuration": ((MllpComponent) component).setConfiguration((org.apache.camel.component.mllp.MllpConfiguration) value); return true;
            case "hl7Headers": getOrCreateConfiguration((MllpComponent) component).setHl7Headers((boolean) value); return true;
            case "requireEndOfData": getOrCreateConfiguration((MllpComponent) component).setRequireEndOfData((boolean) value); return true;
            case "stringPayload": getOrCreateConfiguration((MllpComponent) component).setStringPayload((boolean) value); return true;
            case "validatePayload": getOrCreateConfiguration((MllpComponent) component).setValidatePayload((boolean) value); return true;
            case "acceptTimeout": getOrCreateConfiguration((MllpComponent) component).setAcceptTimeout((int) value); return true;
            case "backlog": getOrCreateConfiguration((MllpComponent) component).setBacklog((java.lang.Integer) value); return true;
            case "bindRetryInterval": getOrCreateConfiguration((MllpComponent) component).setBindRetryInterval((int) value); return true;
            case "bindTimeout": getOrCreateConfiguration((MllpComponent) component).setBindTimeout((int) value); return true;
            case "bridgeErrorHandler": getOrCreateConfiguration((MllpComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lenientBind": getOrCreateConfiguration((MllpComponent) component).setLenientBind((boolean) value); return true;
            case "maxConcurrentConsumers": getOrCreateConfiguration((MllpComponent) component).setMaxConcurrentConsumers((int) value); return true;
            case "reuseAddress": getOrCreateConfiguration((MllpComponent) component).setReuseAddress((java.lang.Boolean) value); return true;
            case "exchangePattern": getOrCreateConfiguration((MllpComponent) component).setExchangePattern((org.apache.camel.ExchangePattern) value); return true;
            case "connectTimeout": getOrCreateConfiguration((MllpComponent) component).setConnectTimeout((int) value); return true;
            case "idleTimeoutStrategy": getOrCreateConfiguration((MllpComponent) component).setIdleTimeoutStrategy((org.apache.camel.component.mllp.MllpIdleTimeoutStrategy) value); return true;
            case "keepAlive": getOrCreateConfiguration((MllpComponent) component).setKeepAlive((java.lang.Boolean) value); return true;
            case "lazyStartProducer": ((MllpComponent) component).setLazyStartProducer((boolean) value); return true;
            case "tcpNoDelay": getOrCreateConfiguration((MllpComponent) component).setTcpNoDelay((java.lang.Boolean) value); return true;
            case "autowiredEnabled": ((MllpComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "defaultCharset": ((MllpComponent) component).setDefaultCharset((java.lang.String) value); return true;
            case "logPhi": ((MllpComponent) component).setLogPhi((java.lang.Boolean) value); return true;
            case "logPhiMaxBytes": ((MllpComponent) component).setLogPhiMaxBytes((java.lang.Integer) value); return true;
            case "maxBufferSize": getOrCreateConfiguration((MllpComponent) component).setMaxBufferSize((int) value); return true;
            case "minBufferSize": getOrCreateConfiguration((MllpComponent) component).setMinBufferSize((int) value); return true;
            case "readTimeout": getOrCreateConfiguration((MllpComponent) component).setReadTimeout((int) value); return true;
            case "receiveBufferSize": getOrCreateConfiguration((MllpComponent) component).setReceiveBufferSize((java.lang.Integer) value); return true;
            case "receiveTimeout": getOrCreateConfiguration((MllpComponent) component).setReceiveTimeout((int) value); return true;
            case "sendBufferSize": getOrCreateConfiguration((MllpComponent) component).setSendBufferSize((java.lang.Integer) value); return true;
            case "sslContextParameters": getOrCreateConfiguration((MllpComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((MllpComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "idleTimeout": getOrCreateConfiguration((MllpComponent) component).setIdleTimeout((java.lang.Integer) value); return true;
            default: return false;
            }
        }
    }
}