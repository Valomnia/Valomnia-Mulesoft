package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;



import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindUnitsTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindUnitsTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findUnits());
            

            assertTrue(getConnector().findUnits().size() > 0);

    }
}