package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import com.google.common.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.AttributeValue;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.gson.Gson;

public class SaveAttributeValueTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveAttributeValueTestCases() {
        super(ValomniaConnector.class);
    }

    
    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
     AttributeValue obj = new AttributeValue();

        boolean exist = false;

        ArrayList<AttributeValue> list = null;
        
        try {
            list = getConnector().findAttributesValue();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
       
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<AttributeValue>>() {}.getType();
        ArrayList<AttributeValue> list1 = new Gson().fromJson(js, listType);

        for (AttributeValue attributeValue: list1)
        {
            if (attributeValue.getAttributeReference().equals("ref test Attribute")&attributeValue.getValue().equals("S"))
                    
                exist = true;
        }
        
        obj.setAttributeReference("ref test Attribute");
        obj.setValue("S");
        
        
        

        

        if (!exist)
            assertEquals(getConnector().saveAttributeValue(obj), expected2);
        else
            assertEquals(getConnector().saveAttributeValue(obj), expected1);
    }

}

