/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerGroupTaxList;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerGroupTaxListTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerGroupTaxListTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
      CustomerGroupTaxList obj = new CustomerGroupTaxList();

        boolean exist = false;
       

        ArrayList<CustomerGroupTaxList> list = null;
        
        try {
            list = getConnector().findCustomersGroupTaxList();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<CustomerGroupTaxList>>() {}.getType();
        ArrayList<CustomerGroupTaxList> list1 = new Gson().fromJson(js, listType);

        for (CustomerGroupTaxList customgroupTaxList : list1)
        {
            if ((customgroupTaxList.getCustomerGroupReference().equals("ref test CustomerGroup"))&
                    (customgroupTaxList.getTaxListName().equals("test TaxList")))
                exist = true;
        }
        
        obj.setCustomerGroupReference("ref test CustomerGroup");
        obj.setTaxListName("test TaxList");
        
        
       

        

        if (!exist)
            assertEquals(getConnector().saveCustomerGroupTaxList(obj), expected2);
        else
            assertEquals(getConnector().saveCustomerGroupTaxList(obj), expected1);
    }


}