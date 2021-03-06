/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerCategoryTaxList;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerCategoryTaxListTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerCategoryTaxListTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
      CustomerCategoryTaxList obj = new CustomerCategoryTaxList();
        boolean exist = false;
       

        ArrayList<CustomerCategoryTaxList> list = null;
        
        try {
            list = getConnector().findCustomersCategoryTaxList();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<CustomerCategoryTaxList>>() {}.getType();
        ArrayList<CustomerCategoryTaxList> list1 = new Gson().fromJson(js, listType);

        for (CustomerCategoryTaxList customerCategoryTaxList : list1)
        {   if (customerCategoryTaxList.getCustomerCategoryReference()!=null)
        
            if ((customerCategoryTaxList.getCustomerCategoryReference().equals("ref test CustomerCategory"))&
                    (customerCategoryTaxList.getTaxListName().equals("test TaxList")))
                exist = true;
            
        }
        
        obj.setCustomerCategoryReference("ref test CustomerCategory");
        obj.setTaxListName("test TaxList");
        
        
        
       

        

        if (!exist)
            assertEquals(getConnector().saveCustomerCategoryTaxList(obj), expected2);
        else
            assertEquals(getConnector().saveCustomerCategoryTaxList(obj), expected1);
    }



}