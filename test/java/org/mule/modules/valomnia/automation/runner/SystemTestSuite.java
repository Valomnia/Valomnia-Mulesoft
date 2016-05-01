package org.mule.modules.valomnia.automation.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.valomnia.automation.system.ConfigTestCases;

@RunWith(Suite.class)
@SuiteClasses({
        ConfigTestCases.class,
         })
public class SystemTestSuite {

}


