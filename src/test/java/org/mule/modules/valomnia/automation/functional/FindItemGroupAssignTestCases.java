package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindItemGroupAssignTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindItemGroupAssignTestCases() {
        super(ValomniaConnector.class);
    }
    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findItemsGroupAssign());
            

            assertTrue(getConnector().findItemsGroupAssign().size() > 0);

    }
   
  
}