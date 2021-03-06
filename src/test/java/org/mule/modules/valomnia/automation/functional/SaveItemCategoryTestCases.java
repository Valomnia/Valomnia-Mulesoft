/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.ItemCategory;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveItemCategoryTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveItemCategoryTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        ItemCategory obj = new ItemCategory();

        boolean exist = false;

        ArrayList<ItemCategory> list = null;
        try {
            list = getConnector().findItemsCategory();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<ItemCategory>>() {}.getType();
        ArrayList<ItemCategory> list1 = new Gson().fromJson(js, listType);

        for (ItemCategory itemCategory : list1)
        {
            if (itemCategory.getReference()
                    .equals("ref test ItemCategory"))
                exist = true;
        }
        obj.setName("test ItemCategory");
        
        obj.setReference("ref test ItemCategory");
       

        

        if (!exist)
            assertEquals(getConnector().saveItemCategory(obj), expected2);
        else
            assertEquals(getConnector().saveItemCategory(obj), expected1);
    }

}

