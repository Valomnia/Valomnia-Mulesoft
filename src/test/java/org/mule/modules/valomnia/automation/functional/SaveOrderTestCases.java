package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Order;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveOrderTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveOrderTestCases() {
        super(ValomniaConnector.class);
    }
    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        Order obj = new Order();

        boolean exist = false;

        ArrayList<Order> list = null;
        try {
            list = getConnector().findOrders();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<Order>>() {}.getType();
        ArrayList<Order> list1 = new Gson().fromJson(js, listType);

        for (Order order : list1)
        {
            if (order.getReference()
                    .equals("ref test Order"))
                    
                exist = true;
        }
        obj.setReference("ref test Order");
        
        obj.setTotalProducts("10");
        obj.setCustomerReference("ref test Customer");
        obj.setUserReference("ref test Employee");
        obj.setTotalHT("100");
        
       obj.setStatus("PAID");
       

        

        if (exist)
            assertEquals(getConnector().saveOrder(obj), expected1);
        else
            assertEquals(getConnector().saveOrder(obj), expected2);
    }

}