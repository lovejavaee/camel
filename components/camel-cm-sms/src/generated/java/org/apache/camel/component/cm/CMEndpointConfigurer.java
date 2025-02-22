/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.cm;

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
public class CMEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CMEndpoint target = (CMEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultfrom":
        case "defaultFrom": target.getConfiguration().setDefaultFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "defaultmaxnumberofparts":
        case "defaultMaxNumberOfParts": target.getConfiguration().setDefaultMaxNumberOfParts(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "producttoken":
        case "productToken": target.getConfiguration().setProductToken(property(camelContext, java.lang.String.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.getConfiguration().setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultfrom":
        case "defaultFrom": return java.lang.String.class;
        case "defaultmaxnumberofparts":
        case "defaultMaxNumberOfParts": return int.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "producttoken":
        case "productToken": return java.lang.String.class;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        CMEndpoint target = (CMEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultfrom":
        case "defaultFrom": return target.getConfiguration().getDefaultFrom();
        case "defaultmaxnumberofparts":
        case "defaultMaxNumberOfParts": return target.getConfiguration().getDefaultMaxNumberOfParts();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "producttoken":
        case "productToken": return target.getConfiguration().getProductToken();
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return target.getConfiguration().isTestConnectionOnStartup();
        default: return null;
        }
    }
}

