package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindCustomerTaxListTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindCustomerTaxListTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findCustomerTaxList());
            

            assertTrue(getConnector().findCustomerTaxList().size() > 0);

    }
}