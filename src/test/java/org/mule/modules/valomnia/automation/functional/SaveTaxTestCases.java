package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;

import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Tax;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


public class SaveTaxTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveTaxTestCases() {
        super(ValomniaConnector.class);
    }
    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
     Tax obj = new Tax();

        boolean exist = false;

        ArrayList<Tax> list = null;
        
        try {
            list = getConnector().findTaxs();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<Tax>>() {}.getType();
        ArrayList<Tax> list1 = new Gson().fromJson(js, listType);

        for (Tax tax : list1)
        {
            if (tax.getItemReference().equals("ref test Item")&tax.getTaxListName().equals("test TaxList"))
                exist = true;
        }
        
        obj.setItemReference("ref test Item");
        obj.setTaxListName("test TaxList");
        obj.setTaxValue("16");;
       

        

        if (exist)
            assertEquals(getConnector().saveTax(obj), expected1);
        else
            assertEquals(getConnector().saveTax(obj), expected2);
    }



}