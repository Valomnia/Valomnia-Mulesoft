/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia.automation.runner;

import org.junit.AfterClass;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.valomnia.ValomniaConnector;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;
import org.mule.modules.valomnia.automation.functional.FindAttributsTestCases;
import org.mule.modules.valomnia.automation.functional.FindCustomersCategoryTestCases;
import org.mule.modules.valomnia.automation.functional.FindCustomerCategroryPriceListTestCases;
import org.mule.modules.valomnia.automation.functional.FindCustomerGroupTaxListTestCases;
import org.mule.modules.valomnia.automation.functional.FindCustomerTaxListTestCases;
import org.mule.modules.valomnia.automation.functional.FindEmployeeGroupsTestCases;
import org.mule.modules.valomnia.automation.functional.FindEmployeesTestCases;
import org.mule.modules.valomnia.automation.functional.FindItemGroupAssignTestCases;
import org.mule.modules.valomnia.automation.functional.FindItemUnitsTestCases;
import org.mule.modules.valomnia.automation.functional.FindItemsGroupTestCases;
import org.mule.modules.valomnia.automation.functional.FindItemsTestCases;
import org.mule.modules.valomnia.automation.functional.FindUsersTestCases;
import org.mule.modules.valomnia.automation.functional.SaveContactTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerGroupAssignTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerGroupTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerTestCases;
import org.mule.modules.valomnia.automation.functional.SaveItemCategoryTestCases;
import org.mule.modules.valomnia.automation.functional.SaveItemGroupAssignTestCases;
import org.mule.modules.valomnia.automation.functional.SaveItemGroupTestCases;
import org.mule.modules.valomnia.automation.functional.SaveItemTestCases;
import org.mule.modules.valomnia.automation.functional.SaveUnitTestCases;
import org.mule.modules.valomnia.automation.functional.SaveUserTestCases;
import org.mule.modules.valomnia.automation.functional.SaveTaxListTestCases;
import org.mule.modules.valomnia.automation.functional.SaveEmployeeTestCases;
import org.mule.modules.valomnia.automation.functional.SavePriceListTestCases;
import org.mule.modules.valomnia.automation.functional.SavePriceTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerCategoryTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerPaymentTypeTestCases;
import org.mule.modules.valomnia.automation.functional.SaveWareHouseTestCases;
import org.mule.modules.valomnia.automation.functional.SaveItemUnitTestCases;
import org.mule.modules.valomnia.automation.functional.SaveAuthorityTestCases;
import org.mule.modules.valomnia.automation.functional.SaveUserAuthorityTestCases;
import org.mule.modules.valomnia.automation.functional.SaveLoadingTestCases;
import org.mule.modules.valomnia.automation.functional.SaveLoadingDetailsTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerEmployeeTestCases;
import org.mule.modules.valomnia.automation.functional.SaveTaxTypeTestCases;
import org.mule.modules.valomnia.automation.functional.FindTaxsTestCases;
import org.mule.modules.valomnia.automation.functional.SaveAttributeTestCases;
import org.mule.modules.valomnia.automation.functional.SaveAttributeValueTestCases;
import org.mule.modules.valomnia.automation.functional.SaveEmployeeGroupTestCases;
import org.mule.modules.valomnia.automation.functional.SaveOrderTestCases;
import org.mule.modules.valomnia.automation.functional.SaveOrderDetailTestCases;
import org.mule.modules.valomnia.automation.functional.SaveOrderPaymentTestCases;
import org.mule.modules.valomnia.automation.functional.SaveWareHouseStockTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerCategoryPriceListTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerPriceListTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerGroupPriceListTestCases;
import org.mule.modules.valomnia.automation.functional.SaveCustomerGroupTaxListTestCases;
import org.mule.modules.valomnia.automation.functional.FindAttributesValueTestCases;

@RunWith(Suite.class)
@SuiteClasses({
        FindAttributesValueTestCases.class,
        FindItemsTestCases.class,
        FindItemsGroupTestCases.class,
        FindAttributsTestCases.class,
        FindUsersTestCases.class,
        FindUsersTestCases.class,
        FindTaxsTestCases.class,
        FindCustomersCategoryTestCases.class,
        FindCustomerCategroryPriceListTestCases.class,
        FindCustomerGroupTaxListTestCases.class,
        FindEmployeeGroupsTestCases.class,
        FindEmployeesTestCases.class,
        FindItemGroupAssignTestCases.class,
        FindItemUnitsTestCases.class,
        FindCustomerTaxListTestCases.class,
        SaveContactTestCases.class,
        SaveItemGroupTestCases.class,
        SaveEmployeeTestCases.class,
        SaveItemGroupAssignTestCases.class,
        SaveItemCategoryTestCases.class,
        SaveItemTestCases.class,
        SaveCustomerTestCases.class,
        SaveCustomerGroupAssignTestCases.class,
        SaveCustomerGroupTestCases.class,
        SaveUnitTestCases.class,
        SaveUserTestCases.class,
        SaveTaxListTestCases.class,
        SavePriceListTestCases.class,
        SavePriceTestCases.class,
        SaveCustomerCategoryTestCases.class,
        SaveCustomerPaymentTypeTestCases.class,
        SaveWareHouseTestCases.class,
        SaveItemUnitTestCases.class,
        SaveAuthorityTestCases.class,
        SaveUserAuthorityTestCases.class,
        SaveLoadingTestCases.class,
        SaveLoadingDetailsTestCases.class,
        SaveCustomerEmployeeTestCases.class,
        SaveTaxTypeTestCases.class,
        SaveEmployeeGroupTestCases.class,
        SaveOrderTestCases.class,
        SaveOrderDetailTestCases.class,
        SaveOrderPaymentTestCases.class,
        SaveWareHouseStockTestCases.class,
        SaveCustomerCategoryPriceListTestCases.class,
        SaveCustomerPriceListTestCases.class,
        SaveCustomerGroupPriceListTestCases.class,
        SaveCustomerGroupTaxListTestCases.class,
        SaveAttributeTestCases.class,
        SaveAttributeValueTestCases.class,
        
})
public class FunctionalTestSuite {

    @BeforeClass
    public static void initialiseSuite() {
        ConnectorTestContext.initialize(ValomniaConnector.class);
    }

    @AfterClass
    public static void shutdownSuite() {
        ConnectorTestContext.shutDown();
    }

}