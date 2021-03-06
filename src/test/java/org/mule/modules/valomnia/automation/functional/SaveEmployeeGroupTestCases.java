/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.EmployeeGroup;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveEmployeeGroupTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveEmployeeGroupTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       EmployeeGroup obj = new EmployeeGroup();

        boolean exist = false;

        ArrayList<EmployeeGroup> list = null;
        try {
            list = getConnector().findEmployeeGroups();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<EmployeeGroup>>() {}.getType();
        ArrayList<EmployeeGroup> list1 = new Gson().fromJson(js, listType);

        for (EmployeeGroup employeeGroup : list1)
        {
            if (employeeGroup.getReference().equals("ref test EmployeeGroup"))
                    
                   
                exist = true;
        }
        obj.setReference("ref test EmployeeGroup");
        obj.setName("name EmployeeGroup");
        

        if (!exist)
            assertEquals(getConnector().saveEmployeeGroup(obj), expected2);
        else
            assertEquals(getConnector().saveEmployeeGroup(obj), expected1);
    }

}