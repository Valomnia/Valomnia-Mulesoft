package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;


import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.Contact;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveContactTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveContactTestCases() {
        super(ValomniaConnector.class);
    }

   

    @Test
    public void verify() {
        java.lang.String expected1 = "Success Updated";
        java.lang.String expected2 = "Success created";
       Contact obj = new Contact();

        boolean exist = false;

        ArrayList<Contact> list = null;
        
        try {
            list = getConnector().findContacts();
        } catch (Exception e) {

            e.printStackTrace();
        }
        Gson gson = new Gson();
        String js = gson.toJson(list);
        @SuppressWarnings("serial")
        Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
        ArrayList<Contact> list1 = new Gson().fromJson(js, listType);

        for (Contact contact : list1)
        {
            if (contact.getCustomerReference().equals("ref test Customer")&contact.getFirstName().equals("test first name")&
            contact.getLastName().equals("test last name"))
                    
                exist = true;
        }
        
        obj.setCustomerReference("ref test Customer");
        obj.setFirstName("test first name");
        obj.setLastName("test last name");;
       

        

        if (exist)
            assertEquals(getConnector().saveContact(obj), expected1);
        else
            assertEquals(getConnector().saveContact(obj), expected2);
    }



    }

