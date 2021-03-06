/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;


import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.OrderDetail;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveOrderDetailTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveOrderDetailTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        OrderDetail obj = new OrderDetail();

        boolean exist = false;

        ArrayList<OrderDetail> list = null;
        try {
            list = getConnector().findOrdersDetail();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<OrderDetail>>() {}.getType();
        ArrayList<OrderDetail> list1 = new Gson().fromJson(js, listType);

        for (OrderDetail orderDetail : list1)
            
            
        {
            if (orderDetail.getOrderReference().equals("ref test Order")&
                    orderDetail.getItemReference().equals("ref test Item")&
                    orderDetail.getUnitReference().equals("ref test Unit"))
                    
                exist = true;
        }
        obj.setOrderReference("ref test Order");
        obj.setItemReference("ref test Item");
        obj.setUnitReference("ref test Unit");
        obj.setFinalPrice("90");
        obj.setUnitPrice("4");
        obj.setQuantity("7");
        obj.setTax("2");
     
       

        

        if (exist)
            assertEquals(getConnector().saveOrderDetail(obj), expected1);
        else
            assertEquals(getConnector().saveOrderDetail(obj), expected2);
    }


}