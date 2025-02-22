/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.qdrant;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.qdrant.QdrantConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class QdrantConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.qdrant.QdrantConfiguration target = (org.apache.camel.component.qdrant.QdrantConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apikey":
        case "apiKey": target.setApiKey(property(camelContext, java.lang.String.class, value)); return true;
        case "client": target.setClient(property(camelContext, io.qdrant.client.QdrantClient.class, value)); return true;
        case "filter": target.setFilter(property(camelContext, io.qdrant.client.grpc.Points.Filter.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "maxresults":
        case "maxResults": target.setMaxResults(property(camelContext, int.class, value)); return true;
        case "port": target.setPort(property(camelContext, int.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, java.time.Duration.class, value)); return true;
        case "tls": target.setTls(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apikey":
        case "apiKey": return java.lang.String.class;
        case "client": return io.qdrant.client.QdrantClient.class;
        case "filter": return io.qdrant.client.grpc.Points.Filter.class;
        case "host": return java.lang.String.class;
        case "maxresults":
        case "maxResults": return int.class;
        case "port": return int.class;
        case "timeout": return java.time.Duration.class;
        case "tls": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.qdrant.QdrantConfiguration target = (org.apache.camel.component.qdrant.QdrantConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apikey":
        case "apiKey": return target.getApiKey();
        case "client": return target.getClient();
        case "filter": return target.getFilter();
        case "host": return target.getHost();
        case "maxresults":
        case "maxResults": return target.getMaxResults();
        case "port": return target.getPort();
        case "timeout": return target.getTimeout();
        case "tls": return target.isTls();
        default: return null;
        }
    }
}

