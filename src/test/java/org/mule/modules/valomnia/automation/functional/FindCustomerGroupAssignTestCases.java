package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindCustomerGroupAssignTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindCustomerGroupAssignTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findCustomersGroupAssign());
            

            assertTrue(getConnector().findCustomersGroupAssign().size() > 0);

    }
}