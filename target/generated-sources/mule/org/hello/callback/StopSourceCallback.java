
package org.hello.callback;

import javax.annotation.Generated;


/**
 * Callback returned by methods that are annotated with @Source
 * <p/>
 * It will be executed when the MessageSource is being stopped.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public interface StopSourceCallback {

    void stop() throws Exception;
}
