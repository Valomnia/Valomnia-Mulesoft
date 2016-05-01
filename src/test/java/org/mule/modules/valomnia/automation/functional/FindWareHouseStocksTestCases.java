package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class FindWareHouseStocksTestCases extends AbstractTestCase<ValomniaConnector> {

    public FindWareHouseStocksTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() throws Exception {
            
            
            
            assertNotNull( getConnector().findWareHouseStocks());
            

            assertTrue(getConnector().findWareHouseStocks().size() > 0);

    }
}