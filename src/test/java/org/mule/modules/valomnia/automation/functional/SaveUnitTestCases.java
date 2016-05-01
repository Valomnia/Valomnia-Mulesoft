package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Unit;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveUnitTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveUnitTestCases() {
        super(ValomniaConnector.class);
    }

    

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       Unit obj = new Unit();

        boolean exist = false;

        ArrayList<Unit> list = null;
        
        try {
            list = getConnector().findUnits();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<Unit>>() {}.getType();
        ArrayList<Unit> list1 = new Gson().fromJson(js, listType);

        for (Unit unit : list1)
        {
            if (unit.getReference().equals("ref test Unit"))
            
                    
                exist = true;
        }
        
        obj.setReference("ref test Unit");
        obj.setName("test name");;
       

        

        if (exist)
            assertEquals(getConnector().saveUnit(obj), expected1);
        else
            assertEquals(getConnector().saveUnit(obj), expected2);
    }



}