
package org.hello.process;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public interface ProcessAdapter<O >{

    <T> ProcessTemplate<T, O> getProcessTemplate();
}
