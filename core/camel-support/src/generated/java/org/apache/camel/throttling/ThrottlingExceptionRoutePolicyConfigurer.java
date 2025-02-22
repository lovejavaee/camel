/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.throttling;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.throttling.ThrottlingExceptionRoutePolicy;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class ThrottlingExceptionRoutePolicyConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.throttling.ThrottlingExceptionRoutePolicy target = (org.apache.camel.throttling.ThrottlingExceptionRoutePolicy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "exceptions": target.setExceptions(property(camelContext, java.lang.String.class, value)); return true;
        case "failurethreshold":
        case "failureThreshold": target.setFailureThreshold(property(camelContext, int.class, value)); return true;
        case "failurewindow":
        case "failureWindow": target.setFailureWindow(property(camelContext, long.class, value)); return true;
        case "halfopenafter":
        case "halfOpenAfter": target.setHalfOpenAfter(property(camelContext, long.class, value)); return true;
        case "halfopenhandler":
        case "halfOpenHandler": target.setHalfOpenHandler(property(camelContext, org.apache.camel.throttling.ThrottlingExceptionHalfOpenHandler.class, value)); return true;
        case "keepopen":
        case "keepOpen": target.setKeepOpen(property(camelContext, boolean.class, value)); return true;
        case "statelogginglevel":
        case "stateLoggingLevel": target.setStateLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "exceptions": return java.lang.String.class;
        case "failurethreshold":
        case "failureThreshold": return int.class;
        case "failurewindow":
        case "failureWindow": return long.class;
        case "halfopenafter":
        case "halfOpenAfter": return long.class;
        case "halfopenhandler":
        case "halfOpenHandler": return org.apache.camel.throttling.ThrottlingExceptionHalfOpenHandler.class;
        case "keepopen":
        case "keepOpen": return boolean.class;
        case "statelogginglevel":
        case "stateLoggingLevel": return org.apache.camel.LoggingLevel.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.throttling.ThrottlingExceptionRoutePolicy target = (org.apache.camel.throttling.ThrottlingExceptionRoutePolicy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "exceptions": return target.getExceptions();
        case "failurethreshold":
        case "failureThreshold": return target.getFailureThreshold();
        case "failurewindow":
        case "failureWindow": return target.getFailureWindow();
        case "halfopenafter":
        case "halfOpenAfter": return target.getHalfOpenAfter();
        case "halfopenhandler":
        case "halfOpenHandler": return target.getHalfOpenHandler();
        case "keepopen":
        case "keepOpen": return target.getKeepOpen();
        case "statelogginglevel":
        case "stateLoggingLevel": return target.getStateLoggingLevel();
        default: return null;
        }
    }
}

