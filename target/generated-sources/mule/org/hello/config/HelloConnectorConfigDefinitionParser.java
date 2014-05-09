
package org.hello.config;

import javax.annotation.Generated;
import org.hello.adapters.HelloConnectorProcessAdapter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public class HelloConnectorConfigDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(HelloConnectorProcessAdapter.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, HelloConnectorProcessAdapter.class);
        setDestroyMethodIfNeeded(builder, HelloConnectorProcessAdapter.class);
        parseProperty(builder, element, "apiUrl", "apiUrl");
        parseProperty(builder, element, "port", "port");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
