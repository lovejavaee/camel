/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.master;

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
public class MasterComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MasterComponent target = (MasterComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "backoffdelay":
        case "backOffDelay": target.setBackOffDelay(property(camelContext, long.class, value)); return true;
        case "backoffmaxattempts":
        case "backOffMaxAttempts": target.setBackOffMaxAttempts(property(camelContext, long.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "service": target.setService(property(camelContext, org.apache.camel.cluster.CamelClusterService.class, value)); return true;
        case "serviceselector":
        case "serviceSelector": target.setServiceSelector(property(camelContext, org.apache.camel.cluster.CamelClusterService.Selector.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "backoffdelay":
        case "backOffDelay": return long.class;
        case "backoffmaxattempts":
        case "backOffMaxAttempts": return long.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "service": return org.apache.camel.cluster.CamelClusterService.class;
        case "serviceselector":
        case "serviceSelector": return org.apache.camel.cluster.CamelClusterService.Selector.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MasterComponent target = (MasterComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "backoffdelay":
        case "backOffDelay": return target.getBackOffDelay();
        case "backoffmaxattempts":
        case "backOffMaxAttempts": return target.getBackOffMaxAttempts();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "service": return target.getService();
        case "serviceselector":
        case "serviceSelector": return target.getServiceSelector();
        default: return null;
        }
    }
}

