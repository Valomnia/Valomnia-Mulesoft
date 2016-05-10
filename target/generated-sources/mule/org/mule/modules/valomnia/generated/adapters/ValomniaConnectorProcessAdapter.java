
package org.mule.modules.valomnia.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ValomniaConnectorProcessAdapter</code> is a wrapper around {@link ValomniaConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-10T10:44:20+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class ValomniaConnectorProcessAdapter
    extends ValomniaConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<ValomniaConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ValomniaConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ValomniaConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ValomniaConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ValomniaConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ValomniaConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
