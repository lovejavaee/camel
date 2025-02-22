/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.activemq6.converter;

import javax.annotation.processing.Generated;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.TypeConverterLoaderGeneratorMojo")
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class ActiveMQMessageConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public ActiveMQMessageConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, org.apache.activemq.command.ActiveMQMessage.class, org.apache.camel.Exchange.class, false,
            (type, exchange, value) -> getActiveMQMessageConverter().toMessage((org.apache.camel.Exchange) value));
        addTypeConverter(registry, org.apache.camel.Processor.class, jakarta.jms.MessageListener.class, false,
            (type, exchange, value) -> getActiveMQMessageConverter().toProcessor((jakarta.jms.MessageListener) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) {
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

    private volatile org.apache.camel.component.activemq6.converter.ActiveMQMessageConverter activeMQMessageConverter;
    private org.apache.camel.component.activemq6.converter.ActiveMQMessageConverter getActiveMQMessageConverter() {
        if (activeMQMessageConverter == null) {
            activeMQMessageConverter = new org.apache.camel.component.activemq6.converter.ActiveMQMessageConverter();
            CamelContextAware.trySetCamelContext(activeMQMessageConverter, camelContext);
        }
        return activeMQMessageConverter;
    }
}
