/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mllp;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class MllpComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.mllp.MllpConfiguration getOrCreateConfiguration(MllpComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.mllp.MllpConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MllpComponent target = (MllpComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accepttimeout":
        case "acceptTimeout": getOrCreateConfiguration(target).setAcceptTimeout(property(camelContext, int.class, value)); return true;
        case "autoack":
        case "autoAck": getOrCreateConfiguration(target).setAutoAck(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "backlog": getOrCreateConfiguration(target).setBacklog(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bindretryinterval":
        case "bindRetryInterval": getOrCreateConfiguration(target).setBindRetryInterval(property(camelContext, int.class, value)); return true;
        case "bindtimeout":
        case "bindTimeout": getOrCreateConfiguration(target).setBindTimeout(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": getOrCreateConfiguration(target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "charsetname":
        case "charsetName": getOrCreateConfiguration(target).setCharsetName(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.mllp.MllpConfiguration.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": getOrCreateConfiguration(target).setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "defaultcharset":
        case "defaultCharset": target.setDefaultCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": getOrCreateConfiguration(target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "hl7headers":
        case "hl7Headers": getOrCreateConfiguration(target).setHl7Headers(property(camelContext, boolean.class, value)); return true;
        case "idletimeout":
        case "idleTimeout": getOrCreateConfiguration(target).setIdleTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "idletimeoutstrategy":
        case "idleTimeoutStrategy": getOrCreateConfiguration(target).setIdleTimeoutStrategy(property(camelContext, org.apache.camel.component.mllp.MllpIdleTimeoutStrategy.class, value)); return true;
        case "keepalive":
        case "keepAlive": getOrCreateConfiguration(target).setKeepAlive(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lenientbind":
        case "lenientBind": getOrCreateConfiguration(target).setLenientBind(property(camelContext, boolean.class, value)); return true;
        case "logphi":
        case "logPhi": target.setLogPhi(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logphimaxbytes":
        case "logPhiMaxBytes": target.setLogPhiMaxBytes(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxbuffersize":
        case "maxBufferSize": getOrCreateConfiguration(target).setMaxBufferSize(property(camelContext, int.class, value)); return true;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": getOrCreateConfiguration(target).setMaxConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "minbuffersize":
        case "minBufferSize": getOrCreateConfiguration(target).setMinBufferSize(property(camelContext, int.class, value)); return true;
        case "readtimeout":
        case "readTimeout": getOrCreateConfiguration(target).setReadTimeout(property(camelContext, int.class, value)); return true;
        case "receivebuffersize":
        case "receiveBufferSize": getOrCreateConfiguration(target).setReceiveBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "receivetimeout":
        case "receiveTimeout": getOrCreateConfiguration(target).setReceiveTimeout(property(camelContext, int.class, value)); return true;
        case "requireendofdata":
        case "requireEndOfData": getOrCreateConfiguration(target).setRequireEndOfData(property(camelContext, boolean.class, value)); return true;
        case "reuseaddress":
        case "reuseAddress": getOrCreateConfiguration(target).setReuseAddress(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "sendbuffersize":
        case "sendBufferSize": getOrCreateConfiguration(target).setSendBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "stringpayload":
        case "stringPayload": getOrCreateConfiguration(target).setStringPayload(property(camelContext, boolean.class, value)); return true;
        case "tcpnodelay":
        case "tcpNoDelay": getOrCreateConfiguration(target).setTcpNoDelay(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "validatepayload":
        case "validatePayload": getOrCreateConfiguration(target).setValidatePayload(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accepttimeout":
        case "acceptTimeout": return int.class;
        case "autoack":
        case "autoAck": return boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "backlog": return java.lang.Integer.class;
        case "bindretryinterval":
        case "bindRetryInterval": return int.class;
        case "bindtimeout":
        case "bindTimeout": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "charsetname":
        case "charsetName": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.mllp.MllpConfiguration.class;
        case "connecttimeout":
        case "connectTimeout": return int.class;
        case "defaultcharset":
        case "defaultCharset": return java.lang.String.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "hl7headers":
        case "hl7Headers": return boolean.class;
        case "idletimeout":
        case "idleTimeout": return java.lang.Integer.class;
        case "idletimeoutstrategy":
        case "idleTimeoutStrategy": return org.apache.camel.component.mllp.MllpIdleTimeoutStrategy.class;
        case "keepalive":
        case "keepAlive": return java.lang.Boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lenientbind":
        case "lenientBind": return boolean.class;
        case "logphi":
        case "logPhi": return java.lang.Boolean.class;
        case "logphimaxbytes":
        case "logPhiMaxBytes": return java.lang.Integer.class;
        case "maxbuffersize":
        case "maxBufferSize": return int.class;
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return int.class;
        case "minbuffersize":
        case "minBufferSize": return int.class;
        case "readtimeout":
        case "readTimeout": return int.class;
        case "receivebuffersize":
        case "receiveBufferSize": return java.lang.Integer.class;
        case "receivetimeout":
        case "receiveTimeout": return int.class;
        case "requireendofdata":
        case "requireEndOfData": return boolean.class;
        case "reuseaddress":
        case "reuseAddress": return java.lang.Boolean.class;
        case "sendbuffersize":
        case "sendBufferSize": return java.lang.Integer.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "stringpayload":
        case "stringPayload": return boolean.class;
        case "tcpnodelay":
        case "tcpNoDelay": return java.lang.Boolean.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        case "validatepayload":
        case "validatePayload": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MllpComponent target = (MllpComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accepttimeout":
        case "acceptTimeout": return getOrCreateConfiguration(target).getAcceptTimeout();
        case "autoack":
        case "autoAck": return getOrCreateConfiguration(target).isAutoAck();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "backlog": return getOrCreateConfiguration(target).getBacklog();
        case "bindretryinterval":
        case "bindRetryInterval": return getOrCreateConfiguration(target).getBindRetryInterval();
        case "bindtimeout":
        case "bindTimeout": return getOrCreateConfiguration(target).getBindTimeout();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return getOrCreateConfiguration(target).isBridgeErrorHandler();
        case "charsetname":
        case "charsetName": return getOrCreateConfiguration(target).getCharsetName();
        case "configuration": return target.getConfiguration();
        case "connecttimeout":
        case "connectTimeout": return getOrCreateConfiguration(target).getConnectTimeout();
        case "defaultcharset":
        case "defaultCharset": return target.getDefaultCharset();
        case "exchangepattern":
        case "exchangePattern": return getOrCreateConfiguration(target).getExchangePattern();
        case "hl7headers":
        case "hl7Headers": return getOrCreateConfiguration(target).isHl7Headers();
        case "idletimeout":
        case "idleTimeout": return getOrCreateConfiguration(target).getIdleTimeout();
        case "idletimeoutstrategy":
        case "idleTimeoutStrategy": return getOrCreateConfiguration(target).getIdleTimeoutStrategy();
        case "keepalive":
        case "keepAlive": return getOrCreateConfiguration(target).getKeepAlive();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lenientbind":
        case "lenientBind": return getOrCreateConfiguration(target).isLenientBind();
        case "logphi":
        case "logPhi": return target.getLogPhi();
        case "logphimaxbytes":
        case "logPhiMaxBytes": return target.getLogPhiMaxBytes();
        case "maxbuffersize":
        case "maxBufferSize": return getOrCreateConfiguration(target).getMaxBufferSize();
        case "maxconcurrentconsumers":
        case "maxConcurrentConsumers": return getOrCreateConfiguration(target).getMaxConcurrentConsumers();
        case "minbuffersize":
        case "minBufferSize": return getOrCreateConfiguration(target).getMinBufferSize();
        case "readtimeout":
        case "readTimeout": return getOrCreateConfiguration(target).getReadTimeout();
        case "receivebuffersize":
        case "receiveBufferSize": return getOrCreateConfiguration(target).getReceiveBufferSize();
        case "receivetimeout":
        case "receiveTimeout": return getOrCreateConfiguration(target).getReceiveTimeout();
        case "requireendofdata":
        case "requireEndOfData": return getOrCreateConfiguration(target).isRequireEndOfData();
        case "reuseaddress":
        case "reuseAddress": return getOrCreateConfiguration(target).getReuseAddress();
        case "sendbuffersize":
        case "sendBufferSize": return getOrCreateConfiguration(target).getSendBufferSize();
        case "sslcontextparameters":
        case "sslContextParameters": return getOrCreateConfiguration(target).getSslContextParameters();
        case "stringpayload":
        case "stringPayload": return getOrCreateConfiguration(target).isStringPayload();
        case "tcpnodelay":
        case "tcpNoDelay": return getOrCreateConfiguration(target).getTcpNoDelay();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        case "validatepayload":
        case "validatePayload": return getOrCreateConfiguration(target).isValidatePayload();
        default: return null;
        }
    }
}

