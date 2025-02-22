/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.neo4j;

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
public class Neo4jComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.neo4j.Neo4jConfiguration getOrCreateConfiguration(Neo4jComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.neo4j.Neo4jConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Neo4jComponent target = (Neo4jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "alias": getOrCreateConfiguration(target).setAlias(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.neo4j.Neo4jConfiguration.class, value)); return true;
        case "databaseurl":
        case "databaseUrl": getOrCreateConfiguration(target).setDatabaseUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "detachrelationship":
        case "detachRelationship": getOrCreateConfiguration(target).setDetachRelationship(property(camelContext, boolean.class, value)); return true;
        case "dimension": getOrCreateConfiguration(target).setDimension(property(camelContext, java.lang.Integer.class, value)); return true;
        case "driver": getOrCreateConfiguration(target).setDriver(property(camelContext, org.neo4j.driver.Driver.class, value)); return true;
        case "kerberosauthticket":
        case "kerberosAuthTicket": getOrCreateConfiguration(target).setKerberosAuthTicket(property(camelContext, java.lang.String.class, value)); return true;
        case "label": getOrCreateConfiguration(target).setLabel(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": getOrCreateConfiguration(target).setMaxResults(property(camelContext, int.class, value)); return true;
        case "minscore":
        case "minScore": getOrCreateConfiguration(target).setMinScore(property(camelContext, double.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "query": getOrCreateConfiguration(target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "realm": getOrCreateConfiguration(target).setRealm(property(camelContext, java.lang.String.class, value)); return true;
        case "similarityfunction":
        case "similarityFunction": getOrCreateConfiguration(target).setSimilarityFunction(property(camelContext, org.apache.camel.component.neo4j.Neo4jSimilarityFunction.class, value)); return true;
        case "token": getOrCreateConfiguration(target).setToken(property(camelContext, java.lang.String.class, value)); return true;
        case "username": getOrCreateConfiguration(target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "vectorindexname":
        case "vectorIndexName": getOrCreateConfiguration(target).setVectorIndexName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"driver"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "alias": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "configuration": return org.apache.camel.component.neo4j.Neo4jConfiguration.class;
        case "databaseurl":
        case "databaseUrl": return java.lang.String.class;
        case "detachrelationship":
        case "detachRelationship": return boolean.class;
        case "dimension": return java.lang.Integer.class;
        case "driver": return org.neo4j.driver.Driver.class;
        case "kerberosauthticket":
        case "kerberosAuthTicket": return java.lang.String.class;
        case "label": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxresults":
        case "maxResults": return int.class;
        case "minscore":
        case "minScore": return double.class;
        case "password": return java.lang.String.class;
        case "query": return java.lang.String.class;
        case "realm": return java.lang.String.class;
        case "similarityfunction":
        case "similarityFunction": return org.apache.camel.component.neo4j.Neo4jSimilarityFunction.class;
        case "token": return java.lang.String.class;
        case "username": return java.lang.String.class;
        case "vectorindexname":
        case "vectorIndexName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Neo4jComponent target = (Neo4jComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "alias": return getOrCreateConfiguration(target).getAlias();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "configuration": return target.getConfiguration();
        case "databaseurl":
        case "databaseUrl": return getOrCreateConfiguration(target).getDatabaseUrl();
        case "detachrelationship":
        case "detachRelationship": return getOrCreateConfiguration(target).isDetachRelationship();
        case "dimension": return getOrCreateConfiguration(target).getDimension();
        case "driver": return getOrCreateConfiguration(target).getDriver();
        case "kerberosauthticket":
        case "kerberosAuthTicket": return getOrCreateConfiguration(target).getKerberosAuthTicket();
        case "label": return getOrCreateConfiguration(target).getLabel();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxresults":
        case "maxResults": return getOrCreateConfiguration(target).getMaxResults();
        case "minscore":
        case "minScore": return getOrCreateConfiguration(target).getMinScore();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "query": return getOrCreateConfiguration(target).getQuery();
        case "realm": return getOrCreateConfiguration(target).getRealm();
        case "similarityfunction":
        case "similarityFunction": return getOrCreateConfiguration(target).getSimilarityFunction();
        case "token": return getOrCreateConfiguration(target).getToken();
        case "username": return getOrCreateConfiguration(target).getUsername();
        case "vectorindexname":
        case "vectorIndexName": return getOrCreateConfiguration(target).getVectorIndexName();
        default: return null;
        }
    }
}

