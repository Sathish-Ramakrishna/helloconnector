
package org.hello.processors;

import java.util.List;
import javax.annotation.Generated;
import org.hello.HelloConnector;
import org.hello.adapters.HelloConnectorProcessAdapter;
import org.hello.process.ProcessAdapter;
import org.hello.process.ProcessCallback;
import org.hello.process.ProcessTemplate;
import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.processor.MessageProcessor;
import org.mule.common.DefaultResult;
import org.mule.common.Result;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.config.i18n.CoreMessages;


/**
 * GetHelloMessageProcessor invokes the {@link org.hello.HelloConnector#getHello(java.lang.String, java.lang.String, java.lang.String)} method in {@link HelloConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-05-09T10:36:55+08:00", comments = "Build 3.4.3.1620.30ea288")
public class GetHelloMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor, OperationMetaDataEnabled
{

    protected Object company;
    protected String _companyType;
    protected Object fname;
    protected String _fnameType;
    protected Object lname;
    protected String _lnameType;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    public void start()
        throws MuleException
    {
    }

    public void stop()
        throws MuleException
    {
    }

    public void dispose() {
    }

    /**
     * Set the Mule context
     * 
     * @param context Mule context to set
     */
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

    /**
     * Sets flow construct
     * 
     * @param flowConstruct Flow construct to set
     */
    public void setFlowConstruct(FlowConstruct flowConstruct) {
        super.setFlowConstruct(flowConstruct);
    }

    /**
     * Sets lname
     * 
     * @param value Value to set
     */
    public void setLname(Object value) {
        this.lname = value;
    }

    /**
     * Sets company
     * 
     * @param value Value to set
     */
    public void setCompany(Object value) {
        this.company = value;
    }

    /**
     * Sets fname
     * 
     * @param value Value to set
     */
    public void setFname(Object value) {
        this.fname = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws MuleException
     */
    public MuleEvent process(final MuleEvent event)
        throws MuleException
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(HelloConnectorProcessAdapter.class, false, event);
            final String _transformedCompany = ((String) evaluateAndTransform(getMuleContext(), event, GetHelloMessageProcessor.class.getDeclaredField("_companyType").getGenericType(), null, company));
            final String _transformedFname = ((String) evaluateAndTransform(getMuleContext(), event, GetHelloMessageProcessor.class.getDeclaredField("_fnameType").getGenericType(), null, fname));
            final String _transformedLname = ((String) evaluateAndTransform(getMuleContext(), event, GetHelloMessageProcessor.class.getDeclaredField("_lnameType").getGenericType(), null, lname));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((HelloConnector) object).getHello(_transformedCompany, _transformedFname, _transformedLname);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getHello"), event, e);
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(String.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

}
