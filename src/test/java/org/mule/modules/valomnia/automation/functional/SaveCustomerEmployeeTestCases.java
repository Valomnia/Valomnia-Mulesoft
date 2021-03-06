/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerEmployee;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerEmployeeTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerEmployeeTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       CustomerEmployee obj = new CustomerEmployee();

        boolean exist = false;

        ArrayList<CustomerEmployee> list = null;
        try {
            list = getConnector().findCustomersEmployee();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<CustomerEmployee>>() {}.getType();
        ArrayList<CustomerEmployee> list1 = new Gson().fromJson(js, listType);

        for (CustomerEmployee customerEmployee : list1)
        {
            if (customerEmployee.getEmployeeReference().equals("ref test Employee")&
                    customerEmployee.getCustomerReference().equals("ref test Customer"))
                   
                exist = true;
        }
        obj.setCustomerReference("ref test Customer");
        obj.setEmployeeReference("ref test Employee");
        

        if (!exist)
            assertEquals(getConnector().saveCustomerEmployee(obj), expected2);
        else
            assertEquals(getConnector().saveCustomerEmployee(obj), expected1);
    }

}
