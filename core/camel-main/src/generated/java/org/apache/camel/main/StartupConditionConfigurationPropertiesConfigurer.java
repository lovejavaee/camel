/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.StartupConditionConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class StartupConditionConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("CustomClassNames", java.lang.String.class);
        map.put("Enabled", boolean.class);
        map.put("EnvironmentVariableExists", java.lang.String.class);
        map.put("FileExists", java.lang.String.class);
        map.put("Interval", int.class);
        map.put("OnTimeout", java.lang.String.class);
        map.put("Timeout", int.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.StartupConditionConfigurationProperties target = (org.apache.camel.main.StartupConditionConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "customclassnames":
        case "customClassNames": target.setCustomClassNames(property(camelContext, java.lang.String.class, value)); return true;
        case "enabled": target.setEnabled(property(camelContext, boolean.class, value)); return true;
        case "environmentvariableexists":
        case "environmentVariableExists": target.setEnvironmentVariableExists(property(camelContext, java.lang.String.class, value)); return true;
        case "fileexists":
        case "fileExists": target.setFileExists(property(camelContext, java.lang.String.class, value)); return true;
        case "interval": target.setInterval(property(camelContext, int.class, value)); return true;
        case "ontimeout":
        case "onTimeout": target.setOnTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "customclassnames":
        case "customClassNames": return java.lang.String.class;
        case "enabled": return boolean.class;
        case "environmentvariableexists":
        case "environmentVariableExists": return java.lang.String.class;
        case "fileexists":
        case "fileExists": return java.lang.String.class;
        case "interval": return int.class;
        case "ontimeout":
        case "onTimeout": return java.lang.String.class;
        case "timeout": return int.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.StartupConditionConfigurationProperties target = (org.apache.camel.main.StartupConditionConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "customclassnames":
        case "customClassNames": return target.getCustomClassNames();
        case "enabled": return target.isEnabled();
        case "environmentvariableexists":
        case "environmentVariableExists": return target.getEnvironmentVariableExists();
        case "fileexists":
        case "fileExists": return target.getFileExists();
        case "interval": return target.getInterval();
        case "ontimeout":
        case "onTimeout": return target.getOnTimeout();
        case "timeout": return target.getTimeout();
        default: return null;
        }
    }
}

