package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Item;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveItemTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveItemTestCases() {
        super(ValomniaConnector.class);
    }

    
    
    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        Item obj = new Item();

        boolean exist = false;

        ArrayList<Item> list = null;
        try {
            list = getConnector().findItems();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<Item>>() {}.getType();
        ArrayList<Item> list1 = new Gson().fromJson(js, listType);

        for (Item item : list1)
        {
            if (item.getReference()
                    .equals("ref test"))
                exist = true;
        }
        obj.setName("test Item");
        obj.setOrganization("test");
        obj.setReference("ref test Item");
        obj.setCategoryReference("ref test ItemCategory");

        obj.setDescription("TEST DESCRIPTION");

        if (!exist)
            assertEquals(getConnector().saveItem(obj), expected2);
        else
            assertEquals(getConnector().saveItem(obj), expected1);
    }

}