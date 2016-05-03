package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindCustomersCategoryTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindCustomersCategoryTestCases() {
        super(ValomniaConnector.class);
    }

    

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findCustomersCategory());
            

            assertTrue(getConnector().findCustomersCategory().size() > 0);

    }
}