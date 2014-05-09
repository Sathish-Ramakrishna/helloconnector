
package org.hello.adapters;

import javax.annotation.Generated;
import org.hello.HelloConnector;
import org.hello.basic.Capabilities;
import org.hello.basic.Capability;


/**
 * A <code>HelloConnectorCapabilitiesAdapter</code> is a wrapper around {@link HelloConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public class HelloConnectorCapabilitiesAdapter
    extends HelloConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
