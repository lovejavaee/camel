/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rocketmq;

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
public class RocketMQEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RocketMQEndpoint target = (RocketMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumergroup":
        case "consumerGroup": target.setConsumerGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namesrvaddr":
        case "namesrvAddr": target.setNamesrvAddr(property(camelContext, java.lang.String.class, value)); return true;
        case "producergroup":
        case "producerGroup": target.setProducerGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "replytoconsumergroup":
        case "replyToConsumerGroup": target.setReplyToConsumerGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "replytotopic":
        case "replyToTopic": target.setReplyToTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "requesttimeoutcheckerintervalmillis":
        case "requestTimeoutCheckerIntervalMillis": target.setRequestTimeoutCheckerIntervalMillis(property(camelContext, long.class, value)); return true;
        case "requesttimeoutmillis":
        case "requestTimeoutMillis": target.setRequestTimeoutMillis(property(camelContext, long.class, value)); return true;
        case "secretkey":
        case "secretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendtag":
        case "sendTag": target.setSendTag(property(camelContext, java.lang.String.class, value)); return true;
        case "subscribetags":
        case "subscribeTags": target.setSubscribeTags(property(camelContext, java.lang.String.class, value)); return true;
        case "waitforsendresult":
        case "waitForSendResult": target.setWaitForSendResult(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumergroup":
        case "consumerGroup": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "namesrvaddr":
        case "namesrvAddr": return java.lang.String.class;
        case "producergroup":
        case "producerGroup": return java.lang.String.class;
        case "replytoconsumergroup":
        case "replyToConsumerGroup": return java.lang.String.class;
        case "replytotopic":
        case "replyToTopic": return java.lang.String.class;
        case "requesttimeoutcheckerintervalmillis":
        case "requestTimeoutCheckerIntervalMillis": return long.class;
        case "requesttimeoutmillis":
        case "requestTimeoutMillis": return long.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sendtag":
        case "sendTag": return java.lang.String.class;
        case "subscribetags":
        case "subscribeTags": return java.lang.String.class;
        case "waitforsendresult":
        case "waitForSendResult": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RocketMQEndpoint target = (RocketMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getAccessKey();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumergroup":
        case "consumerGroup": return target.getConsumerGroup();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "namesrvaddr":
        case "namesrvAddr": return target.getNamesrvAddr();
        case "producergroup":
        case "producerGroup": return target.getProducerGroup();
        case "replytoconsumergroup":
        case "replyToConsumerGroup": return target.getReplyToConsumerGroup();
        case "replytotopic":
        case "replyToTopic": return target.getReplyToTopic();
        case "requesttimeoutcheckerintervalmillis":
        case "requestTimeoutCheckerIntervalMillis": return target.getRequestTimeoutCheckerIntervalMillis();
        case "requesttimeoutmillis":
        case "requestTimeoutMillis": return target.getRequestTimeoutMillis();
        case "secretkey":
        case "secretKey": return target.getSecretKey();
        case "sendtag":
        case "sendTag": return target.getSendTag();
        case "subscribetags":
        case "subscribeTags": return target.getSubscribeTags();
        case "waitforsendresult":
        case "waitForSendResult": return target.isWaitForSendResult();
        default: return null;
        }
    }
}

