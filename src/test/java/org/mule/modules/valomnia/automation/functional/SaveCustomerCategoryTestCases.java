/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerCategory;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerCategoryTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerCategoryTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String  expected2 = "Success created";
        CustomerCategory obj = new CustomerCategory();

        boolean exist = false;

        ArrayList<CustomerCategory> list = null;
        try {
            list = getConnector().findCustomersCategory();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);

        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<CustomerCategory>>() {
        }.getType();
        ArrayList<CustomerCategory> list1 = new Gson().fromJson(js, listType);

        for (CustomerCategory customerCategory : list1)
        {
            if (customerCategory.getReference()
                    .equals("ref test CustomerCategory"))
                exist = true;
        }
        obj.setReference("ref test CustomerCategory");

        obj.setName("test name");

        if (!exist)
            assertEquals(getConnector().saveCustomerCategory(obj), expected2);
        else
            assertEquals(getConnector().saveCustomerCategory(obj), expected1);
    }

}