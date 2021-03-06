/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.ItemUnit;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveItemUnitTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveItemUnitTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        ItemUnit obj = new ItemUnit();

        boolean exist = false;

        ArrayList<ItemUnit> list = null;
        try {
            list = getConnector().findItemUnits();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<ItemUnit>>() {}.getType();
        ArrayList<ItemUnit> list1 = new Gson().fromJson(js, listType);

        for (ItemUnit itemUnit : list1)
        {
            if (itemUnit.getItemReference()
                    .equals("ref test Item")&itemUnit.getUnitReference().equals("ref test Unit"))
                exist = true;
        }
        obj.setItemReference("ref test Item");
        obj.setUnitReference("ref test Unit");
        obj.setQuantity("1");
        
       

        

        if (!exist)
            assertEquals(getConnector().saveItemUnit(obj), expected2);
        else
            assertEquals(getConnector().saveItemUnit(obj), expected1);
    }

}