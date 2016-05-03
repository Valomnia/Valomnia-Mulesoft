package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerGroupPriceList;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerGroupPriceListTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerGroupPriceListTestCases() {
        super(ValomniaConnector.class);
    }
    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
      CustomerGroupPriceList obj = new CustomerGroupPriceList();

        boolean exist = false;
       

        ArrayList<CustomerGroupPriceList> list = null;
        
        try {
            list = getConnector().findCustomersGroupPriceList();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<CustomerGroupPriceList>>() {}.getType();
        ArrayList<CustomerGroupPriceList> list1 = new Gson().fromJson(js, listType);

        for (CustomerGroupPriceList customgroupPriceList : list1)
        {
            if ((customgroupPriceList.getCustomerGroupReference().equals("ref test CustomerGroup"))&
                    (customgroupPriceList.getPriceListReference().equals("ref test PriceList")))
                exist = true;
        }
        
        obj.setCustomerGroupReference("ref test CustomerGroup");
        obj.setPriceListReference("ref test PriceList");
        
        
       

        

        if (!exist)
            assertEquals(getConnector().saveCustomerGroupPriceList(obj), expected2);
        else
            assertEquals(getConnector().saveCustomerGroupPriceList(obj), expected1);
    }


   

}