package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindContactsTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindContactsTestCases() {
        super(ValomniaConnector.class);
    }

    @Before
    public void setup() {
        // TODO
    }

    @After
    public void tearDown() {
        // TODO
    }

    @Test
public void verify() throws Exception {


assertNotNull( getConnector().findContacts());
}
}