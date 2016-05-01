package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.ItemGroupAssign;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveItemGroupAssignTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveItemGroupAssignTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
    java.lang.String expected1 = "Success Updated";
    java.lang.String expected2 = "Success created";
    ItemGroupAssign obj = new ItemGroupAssign();

    boolean exist = false;

    ArrayList<ItemGroupAssign> list = null ;
    try {
        list = getConnector().findItemsGroupAssign();
    } catch (Exception e) {

        e.printStackTrace();
    }
    Gson gson = new Gson();
    String js = gson.toJson(list);
    @SuppressWarnings("serial")
    Type listType = new TypeToken<ArrayList<ItemGroupAssign>>() {}.getType();
    ArrayList<ItemGroupAssign> list1 = new Gson().fromJson(js, listType);

    for (ItemGroupAssign itemGroupAssign : list1)
    {
        if (itemGroupAssign.getItemGroupReference().equals("ref test ItemGroup")&
                itemGroupAssign.getItemReference().equals("ref test Item"))
            exist = true;
    }
    obj.setItemGroupReference("ref test ItemGroup");
    
    obj.setItemReference("ref test Item");
    

    

    if (!exist)
        assertEquals(getConnector().saveItemGroupAssign(obj), expected2);
    else
        assertEquals(getConnector().saveItemGroupAssign(obj), expected1);
}

}



