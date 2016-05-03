/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.ItemGroup;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveItemGroupTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveItemGroupTestCases() {
        super(ValomniaConnector.class);
    }
    @Test
    public void verify() {
    java.lang.String expected1 = "Success Updated";
    java.lang.String expected2 = "Success created";
    ItemGroup obj = new ItemGroup();

    boolean exist = false;

    ArrayList<ItemGroup> list = null ;
    try {
        list = getConnector().findItemsGroup();
    } catch (Exception e) {

        e.printStackTrace();
    }
    Gson gson = new Gson();
    String js = gson.toJson(list);
    @SuppressWarnings("serial")
    Type listType = new TypeToken<ArrayList<ItemGroup>>() {}.getType();
    ArrayList<ItemGroup> list1 = new Gson().fromJson(js, listType);

    for (ItemGroup itemGroup : list1)
    {
        if (itemGroup.getReference().equals("ref test ItemGroup"))
            exist = true;
    }
    obj.setName("test ItemGroup");
    
    obj.setReference("ref test ItemGroup");
    

    obj.setDescription("test description ItemGroup");

    if (exist)
        assertEquals(getConnector().saveItemGroup(obj), expected1);
    else
        assertEquals(getConnector().saveItemGroup(obj), expected2);
}

}


