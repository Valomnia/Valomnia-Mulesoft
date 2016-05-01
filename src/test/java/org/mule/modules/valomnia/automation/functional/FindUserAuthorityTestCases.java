package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindUserAuthorityTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindUserAuthorityTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findUsersAuthority());
            

            assertTrue(getConnector().findUsersAuthority().size() > 0);

    }
}