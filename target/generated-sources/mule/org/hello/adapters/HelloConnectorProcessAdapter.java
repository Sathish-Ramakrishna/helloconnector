
package org.hello.adapters;

import javax.annotation.Generated;
import org.hello.HelloConnector;
import org.hello.process.ProcessAdapter;
import org.hello.process.ProcessCallback;
import org.hello.process.ProcessTemplate;
import org.hello.process.ProcessTemplate;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;


/**
 * A <code>HelloConnectorProcessAdapter</code> is a wrapper around {@link HelloConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public class HelloConnectorProcessAdapter
    extends HelloConnectorLifecycleAdapter
    implements ProcessAdapter<HelloConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, HelloConnectorCapabilitiesAdapter> getProcessTemplate() {
        final HelloConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,HelloConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, HelloConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, HelloConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
