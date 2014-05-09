
package org.hello.process;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public class ProcessCallbackProcessInterceptor<T, O >implements ProcessInterceptor<T, O>
{


    public T execute(ProcessCallback<T, O> processCallback, O object, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processCallback.process(object);
    }

    public T execute(ProcessCallback<T, O> processCallback, O object, Filter filter, MuleMessage message)
        throws Exception
    {
        return processCallback.process(object);
    }

}
