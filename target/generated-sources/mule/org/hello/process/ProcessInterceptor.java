
package org.hello.process;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public interface ProcessInterceptor<T,O >{

       T execute(ProcessCallback<T, O> callback, O under, org.mule.api.processor.MessageProcessor messageProcessor, org.mule.api.MuleEvent event) throws Exception;
    T execute(ProcessCallback<T, O> callback, O under, org.mule.api.routing.filter.Filter filter, org.mule.api.MuleMessage message) throws Exception;
}
