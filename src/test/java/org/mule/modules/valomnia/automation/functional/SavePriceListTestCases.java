/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.PriceList;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SavePriceListTestCases extends AbstractTestCase<ValomniaConnector> {

    public SavePriceListTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        PriceList obj = new PriceList();

        boolean exist = false;

        ArrayList<PriceList> list = null;
        try {
            list = getConnector().findPriceLists();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<PriceList>>() {}.getType();
        ArrayList<PriceList> list1 = new Gson().fromJson(js, listType);

        for (PriceList priceList : list1)
        {
            if (priceList.getReference()
                    .equals("ref test PriceList"))
                exist = true;
        }
        obj.setName("test name");
        
        obj.setReference("ref test PriceList");
       

        

        if (!exist)
            assertEquals(getConnector().savePriceList(obj), expected2);
        else
            assertEquals(getConnector().savePriceList(obj), expected1);
    }


}