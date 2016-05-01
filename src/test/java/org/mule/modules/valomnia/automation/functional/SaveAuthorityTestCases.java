package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Authority;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveAuthorityTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveAuthorityTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       Authority obj = new Authority();
        boolean exist = false;

        ArrayList<Authority> list = null;
        
        try {
            list = getConnector().findAuthority();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<Authority>>() {}.getType();
        ArrayList<Authority> list1 = new Gson().fromJson(js, listType);

        for (Authority Authority : list1)
        {
            if (Authority.getName().equals("test Authority"))
                    
                exist = true;
        }
        
        obj.setName("test Authority");
       

        

        if (exist)
            assertEquals(getConnector().saveAuthority(obj), expected1);
        else
            assertEquals(getConnector().saveAuthority(obj), expected2);
    }



    }


