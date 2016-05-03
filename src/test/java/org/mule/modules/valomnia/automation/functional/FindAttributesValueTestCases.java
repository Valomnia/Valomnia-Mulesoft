package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindAttributesValueTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindAttributesValueTestCases() {
        super(ValomniaConnector.class);
    }
    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findAttributesValue());
            

            assertTrue(getConnector().findAttributesValue().size() > 0);

    }
}