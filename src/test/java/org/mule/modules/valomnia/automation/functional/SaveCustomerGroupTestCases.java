package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;




import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerGroup;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerGroupTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerGroupTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       CustomerGroup obj = new CustomerGroup();

        boolean exist = false;

        ArrayList<CustomerGroup> list = null;
        
        try {
            list = getConnector().findCustomersGroup();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<CustomerGroup>>() {}.getType();
        ArrayList<CustomerGroup> list1 = new Gson().fromJson(js, listType);

        for (CustomerGroup customerGroup: list1)
        {
            if (customerGroup.getReference().equals("ref test CustomerGroup"))
                    
                exist = true;
        }
        
        obj.setReference("ref test CustomerGroup");
        obj.setName("test name  CustomerGroup");
        

        

        if (!exist)
            assertEquals(getConnector().saveCustomerGroup(obj), expected2);
        else
            assertEquals(getConnector().saveCustomerGroup(obj), expected1);
    }



    }


