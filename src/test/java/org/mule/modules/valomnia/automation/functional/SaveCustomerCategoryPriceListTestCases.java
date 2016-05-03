package org.mule.modules.valomnia.automation.functional;

import static org.junit.Assert.*;


import java.lang.reflect.Type;
import java.util.ArrayList;
import org.junit.Test;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.modules.valomnia.entities.CustomerCategoryPriceList;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class SaveCustomerCategoryPriceListTestCases extends AbstractTestCase<ValomniaConnector> {

    public SaveCustomerCategoryPriceListTestCases() {
        super(ValomniaConnector.class);
    }

        
                @Test
                public void verify() {
                    java.lang.String expected1 = "Success Updated";
                    java.lang.String expected2 = "Success created";
                    CustomerCategoryPriceList obj = new CustomerCategoryPriceList();

                    boolean exist = false;

                    ArrayList<CustomerCategoryPriceList> list = null;
                    try {
                        list = getConnector().findCustomersCategoryPriceList();
                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                    Gson gson = new Gson();
                    String js = gson.toJson(list);

                    @SuppressWarnings("serial")
                    Type listType = new TypeToken<ArrayList<CustomerCategoryPriceList>>() {
                    }.getType();
                    ArrayList<CustomerCategoryPriceList> list1 = new Gson().fromJson(js, listType);

                    for (CustomerCategoryPriceList customerCategoryPriceList : list1)
                    {
                        if (customerCategoryPriceList.getCustomerCategoryReference()
                                .equals("ref test CustomerCategory")& customerCategoryPriceList.getPriceListReference().equals("ref test PriceList"))
                            exist = true;
                    }
                    obj.setCustomerCategoryReference("ref test CustomerCategory");

                    obj.setPriceListReference("ref test PriceList");

                    if (!exist)
                        assertEquals(getConnector().saveCustomerCategoryPriceList(obj), expected2);
                    else
                        assertEquals(getConnector().saveCustomerCategoryPriceList(obj), expected1);
    }
}