package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.TaxType;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveTaxTypeTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveTaxTypeTestCases() {
        super(ValomniaConnector.class);
    }

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       TaxType obj = new TaxType();

        boolean exist = false;

        ArrayList<TaxType> list = null;
        
        try {
            list = getConnector().findTaxTypes();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<TaxType>>() {}.getType();
        ArrayList<TaxType> list1 = new Gson().fromJson(js, listType);

        for (TaxType taxType: list1)  
        {
            if (taxType.getName().equals(" test TaxType"))
                    
                exist = true;
        }
        
        
        obj.setName("test TaxType");
        
       

        

        if (exist)
            assertEquals(getConnector().saveTaxType(obj), expected1);
        else
            assertEquals(getConnector().saveTaxType(obj), expected2);
    }


}