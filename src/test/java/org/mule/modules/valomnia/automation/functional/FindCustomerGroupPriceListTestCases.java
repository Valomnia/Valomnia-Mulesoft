package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;



import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindCustomerGroupPriceListTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindCustomerGroupPriceListTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findCustomersGroupPriceList());
            

            assertTrue(getConnector().findCustomersGroupPriceList().size() > 0);

    }
}