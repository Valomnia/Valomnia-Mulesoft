package org.mule.modules.valomnia.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.valomnia.automation.functional.FindContactsTestCases;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

@RunWith(Suite.class)
@SuiteClasses({
        FindContactsTestCases.class
})
public class FunctionalTestSuite {

    @BeforeClass
    public static void initialiseSuite() {
        ConnectorTestContext.initialize(ValomniaConnector.class);
    }

    @AfterClass
    public static void shutdownSuite() {
        ConnectorTestContext.shutDown();
    }

}