/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;


import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.OrderPayment;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveOrderPaymentTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveOrderPaymentTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
        OrderPayment obj = new OrderPayment();

        boolean exist = false;

        ArrayList<OrderPayment> list = null;
        try {
            list = getConnector().findOrdersPayment();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<OrderPayment>>() {}.getType();
        ArrayList<OrderPayment> list1 = new Gson().fromJson(js, listType);

        for (OrderPayment orderPayment : list1)
        {
            if (orderPayment.getPaymentReference()!=null)
                    if (orderPayment.getPaymentReference().equals("ref test OrderPayment"))
                    
                    
                exist = true;
        }
        obj.setPaymentReference("ref test OrderPayment");
        obj.setOrderReference("ref test Order");
       
        
        obj.setPaymentDate("12/02/2017 13:40:12");
        obj.setIsLast("false");
        
       

        

        if (exist)
            assertEquals(getConnector().saveOrderPayment(obj), expected1);
        else
            assertEquals(getConnector().saveOrderPayment(obj), expected2);
    }


}