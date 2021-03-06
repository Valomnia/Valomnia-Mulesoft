/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.UserAuthority;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveUserAuthorityTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveUserAuthorityTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       UserAuthority obj = new UserAuthority();
        boolean exist = false;

        ArrayList<UserAuthority> list = null;
        
        try {
            list = getConnector().findUsersAuthority();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<UserAuthority>>() {}.getType();
        ArrayList<UserAuthority> list1 = new Gson().fromJson(js, listType);

        for (UserAuthority userAuthority : list1)
        {
            if (userAuthority.getAuthorityName().equals("test Authority")&userAuthority.getUserEmail().equals("Test@valomnia.com"))
                    
                exist = true;
        }
        
        obj.setAuthorityName("test Authority");
        obj.setUserEmail("Test@valomnia.com");
        
       

        

        if (exist)
            assertEquals(getConnector().saveUserAuthority(obj), expected1);
        else
            assertEquals(getConnector().saveUserAuthority(obj), expected2);
    }



    }
