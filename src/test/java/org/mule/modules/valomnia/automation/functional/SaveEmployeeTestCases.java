/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Employee;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveEmployeeTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveEmployeeTestCases() {
        super(ValomniaConnector.class);
    }

    
            @Test
            public void verify() {
                java.lang.String expected1 = "Success Updated";
                java.lang.String expected2 = "Success created";
                Employee obj = new Employee();

                boolean exist = false;

                ArrayList<Employee> list = null;
                try {
                    list = getConnector().findEmployees();
                } catch (Exception e) {

                    e.printStackTrace();
                }
                Gson gson = new Gson();
                String js = gson.toJson(list);
                @SuppressWarnings("serial")
                Type listType = new TypeToken<ArrayList<Employee>>() {}.getType();
                ArrayList<Employee> list1 = new Gson().fromJson(js, listType);

                for (Employee employee : list1)
                {
                    if (employee.getReference()
                            .equals("ref test Employee"))
                        exist = true;
                }
                obj.setFirstName("test Item");
                
                obj.setReference("ref test Employee");
                obj.setFirstName("test First Name");

                obj.setLastName("test Last Name");

                if (!exist)
                    assertEquals(getConnector().saveEmployee(obj), expected2);
                else
                    assertEquals(getConnector().saveEmployee(obj), expected1);
            }

        }       

