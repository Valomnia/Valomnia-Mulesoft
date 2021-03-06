/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.User;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveUserTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveUserTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       User obj = new User();

        boolean exist = false;

        ArrayList<User> list = null;
        
        try {
            list = getConnector().findUsers();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<User>>() {}.getType();
        ArrayList<User> list1 = new Gson().fromJson(js, listType);

        for (User user : list1)
        {
            if (user.getEmail().equals("Test@valomnia.com"))
                    
                exist = true;
        }
        
        obj.setEmail("Test@valomnia.com");
        obj.setEmployeeReference("ref test Employee");
        
       

        

        if (exist)
            assertEquals(getConnector().saveUser(obj), expected1);
        else
            assertEquals(getConnector().saveUser(obj), expected2);
    }



}