
package org.hello.adapters;

import javax.annotation.Generated;
import org.hello.HelloConnector;
import org.hello.basic.MetadataAware;


/**
 * A <code>HelloConnectorMetadataAdapater</code> is a wrapper around {@link HelloConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public class HelloConnectorMetadataAdapater
    extends HelloConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Hello";
    private final static String MODULE_VERSION = "1.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.4.3";
    private final static String DEVKIT_BUILD = "3.4.3.1620.30ea288";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
