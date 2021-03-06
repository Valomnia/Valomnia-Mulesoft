/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Attribute;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveAttributeTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveAttributeTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        
            java.lang.String expected1 = "Success Updated";
            java.lang.String expected2 = "Success created";
         Attribute obj = new Attribute();

            boolean exist = false;

            ArrayList<Attribute> list = null;
            
            try {
                list = getConnector().findAttributs();
            } catch (Exception e) {

                e.printStackTrace();
            }
            Gson gson = new Gson();
            String js = gson.toJson(list);
           
           
            @SuppressWarnings("serial")
            Type listType = new TypeToken<ArrayList<Attribute>>() {}.getType();
            ArrayList<Attribute> list1 = new Gson().fromJson(js, listType);

            for (Attribute attribute: list1)
            {
                if( attribute.getReference()!=null)
                        if (attribute.getReference().equals("ref test Attribute"))
                        
           
                    exist = true;
}
            obj.setReference("ref test Attribute");
            obj.setName("test name  Attribute");
            obj.setType("COLOR");
            
            

            

            if (!exist)
                assertEquals(getConnector().saveAttribute(obj), expected2);
            else
                assertEquals(getConnector().saveAttribute(obj), expected1);
        }
}