/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.valomnia;


import java.util.ArrayList;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Payload;
import org.mule.modules.valomnia.core.ConnectorConfig;
import org.mule.modules.valomnia.entities.Attribute;
import org.mule.modules.valomnia.entities.AttributeValue;
import org.mule.modules.valomnia.entities.Authority;
import org.mule.modules.valomnia.entities.Contact;
import org.mule.modules.valomnia.entities.Customer;
import org.mule.modules.valomnia.entities.CustomerCategory;
import org.mule.modules.valomnia.entities.CustomerCategoryPriceList;
import org.mule.modules.valomnia.entities.CustomerCategoryTaxList;
import org.mule.modules.valomnia.entities.CustomerEmployee;
import org.mule.modules.valomnia.entities.CustomerGroup;
import org.mule.modules.valomnia.entities.CustomerGroupAssign;
import org.mule.modules.valomnia.entities.CustomerGroupPriceList;
import org.mule.modules.valomnia.entities.CustomerGroupTaxList;
import org.mule.modules.valomnia.entities.CustomerPaymentType;
import org.mule.modules.valomnia.entities.CustomerPriceList;
import org.mule.modules.valomnia.entities.CustomerTaxList;
import org.mule.modules.valomnia.entities.Employee;
import org.mule.modules.valomnia.entities.EmployeeGroup;
import org.mule.modules.valomnia.entities.Item;
import org.mule.modules.valomnia.entities.ItemAttribute;
import org.mule.modules.valomnia.entities.ItemCategory;
import org.mule.modules.valomnia.entities.ItemGroup;
import org.mule.modules.valomnia.entities.ItemGroupAssign;
import org.mule.modules.valomnia.entities.ItemUnit;
import org.mule.modules.valomnia.entities.Loading;
import org.mule.modules.valomnia.entities.LoadingDetails;
import org.mule.modules.valomnia.entities.Order;
import org.mule.modules.valomnia.entities.OrderDetail;
import org.mule.modules.valomnia.entities.OrderPayment;
import org.mule.modules.valomnia.entities.Price;
import org.mule.modules.valomnia.entities.PriceList;
import org.mule.modules.valomnia.entities.Tax;
import org.mule.modules.valomnia.entities.TaxList;
import org.mule.modules.valomnia.entities.TaxType;
import org.mule.modules.valomnia.entities.Unit;
import org.mule.modules.valomnia.entities.User;
import org.mule.modules.valomnia.entities.UserAuthority;
import org.mule.modules.valomnia.entities.WareHouse;
import org.mule.modules.valomnia.entities.WareHouseStock;

@Connector(name = "valomnia", friendlyName = "Valomnia")
public class ValomniaConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

    /**
     * Find all Items for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-items}
     *
     * @return List of all the Items
     * @throws Exception
     */

    @Processor
    public ArrayList<Item> findItems() throws Exception {
        return this.config.getClientProvider()
                .getClient(Item.class)
                .getAll();
    }

    /**
     * Find all Customers for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers}
     *
     * @return a List of all the Customers
     * @throws Exception
     */

    @Processor
    public ArrayList<Customer> findCustomers() throws Exception {

        return this.config.getClientProvider()
                .getClient(Customer.class)
                .getAll();

    }

    @Processor
    public ArrayList<Attribute> findAttributs() throws Exception {

        return this.config.getClientProvider()
                .getClient(Attribute.class)
                .getAll();

    }
    
    @Processor
    public ArrayList<ItemAttribute> findItemsAttribute() throws Exception {

        return this.config.getClientProvider()
                .getClient(ItemAttribute.class)
                .getAll();

    }

    @Processor
    public ArrayList<Order> findOrders() throws Exception {
        return this.config.getClientProvider()
                .getClient(Order.class)
                .getAll();
    }

    @Processor
    public ArrayList<ItemGroup> findItemsGroup() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemGroup.class)
                .getAll();
    }

    @Processor
    public ArrayList<ItemGroupAssign> findItemsGroupAssign() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemGroupAssign.class)
                .getAll();
    }

    @Processor
    public ArrayList<Unit> findUnits() throws Exception {
        return this.config.getClientProvider()
                .getClient(Unit.class)
                .getAll();
    }

    @Processor
    public ArrayList<ItemUnit> findItemUnits() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemUnit.class)
                .getAll();
    }

    @Processor
    public ArrayList<TaxType> findTaxTypes() throws Exception {
        return this.config.getClientProvider()
                .getClient(TaxType.class)
                .getAll();
    }

    @Processor
    public ArrayList<TaxList> findTaxLists() throws Exception {
        return this.config.getClientProvider()
                .getClient(TaxList.class)
                .getAll();
    }

    @Processor
    public ArrayList<Tax> findTaxs() throws Exception {
        return this.config.getClientProvider()
                .getClient(Tax.class)
                .getAll();
    }

    @Processor
    public ArrayList<PriceList> findPriceLists() throws Exception {
        return this.config.getClientProvider()
                .getClient(PriceList.class)
                .getAll();
    }
    
    

    @Processor
    public ArrayList<Price> findPrices() throws Exception {
        return this.config.getClientProvider()
                .getClient(Price.class)
                .getAll();
    }
    
    @Processor
    public ArrayList<OrderDetail> findOrdersDetail() throws Exception {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerCategory> findCustomersCategory() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerCategory.class)
                .getAll();
    }

    @Processor
    public ArrayList<Contact> findContacts() throws Exception {
        return this.config.getClientProvider()
                .getClient(Contact.class)
                .getAll();
    }
    
    @Processor
    public ArrayList<CustomerGroup> findCustomersGroup() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroup.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerGroupAssign> findCustomersGroupAssign() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroupAssign.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerGroupPriceList> findCustomersGroupPriceList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroupPriceList.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerGroupTaxList> findCustomersGroupTaxList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroupTaxList.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerCategoryPriceList> findCustomersCategoryPriceList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryPriceList.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerCategoryTaxList> findCustomersCategoryTaxList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryTaxList.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerPaymentType> findCustomerPaymentType() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerPaymentType.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerPriceList> findCustomersPriceList() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerTaxList> findCustomerTaxList() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerTaxList.class)
                .getAll();
    }

    @Processor
    public ArrayList<WareHouse> findWareHouses() throws Exception {
        return this.config.getClientProvider()
                .getClient(WareHouse.class)
                .getAll();
    }

    @Processor
    public ArrayList<WareHouseStock> findWareHouseStocks() throws Exception {
        return this.config.getClientProvider()
                .getClient(WareHouseStock.class)
                .getAll();
    }

    @Processor
    public ArrayList<OrderDetail> findOrdersDetails() throws Exception {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .getAll();
    }

    @Processor
    public ArrayList<EmployeeGroup> findEmployeeGroups() throws Exception {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
                .getAll();
    }

    @Processor
    public ArrayList<Employee> findEmployees() throws Exception {
        return this.config.getClientProvider()
                .getClient(Employee.class)
                .getAll();
    }

    @Processor
    public ArrayList<User> findUsers() throws Exception {
        return this.config.getClientProvider()
                .getClient(User.class)
                .getAll();
    }

    @Processor
    public ArrayList<Authority> findAuthority() throws Exception {
        return this.config.getClientProvider()
                .getClient(Authority.class)
                .getAll();
    }

    @Processor
    public ArrayList<UserAuthority> findUsersAuthority() throws Exception {
        return this.config.getClientProvider()
                .getClient(UserAuthority.class)
                .getAll();
    }

    @Processor
    public ArrayList<Loading> findLoadings() throws Exception {
        return this.config.getClientProvider()
                .getClient(Loading.class)
                .getAll();
    }
    
    @Processor
    public ArrayList<AttributeValue> findAttributesValue() throws Exception {
        return this.config.getClientProvider()
                .getClient(AttributeValue.class)
                .getAll();
    }

    @Processor
    public ArrayList<LoadingDetails> findLoadingDetails() throws Exception {
        return this.config.getClientProvider()
                .getClient(LoadingDetails.class)
                .getAll();
    }

    @Processor
    public ArrayList<CustomerEmployee> findCustomersEmployee() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerEmployee.class)
                .getAll();
    }
    
    @Processor
    public ArrayList<OrderPayment> findOrdersPayment() throws Exception {
        return this.config.getClientProvider()
                .getClient(OrderPayment.class)
                .getAll();
    }

   
    
    
    @Processor
    public ArrayList<ItemCategory> findItemsCategory() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemCategory.class)
                .getAll();
    }

    /**
     * Save Or Update an Item entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-item}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveItem(@Payload Item obj) {
        return this.config.getClientProvider()
                .getClient(Item.class)
                .merge(obj);
    }
    
    @Processor
    public String saveCustomerCategoryPriceList(@Payload CustomerCategoryPriceList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryPriceList.class)
                .merge(obj);
    }
    
    @Processor
    public String saveCustomerCategory(@Payload CustomerCategory obj) {
        return this.config.getClientProvider()
                .getClient(CustomerCategory.class)
                .merge(obj);
    }
    
    @Processor
    public String savePriceList(@Payload PriceList obj) {
        return this.config.getClientProvider()
                .getClient(PriceList.class)
                .merge(obj);
    }
    
    
    
    @Processor
    public String saveCustomerCategoryTaxList(@Payload CustomerCategoryTaxList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryTaxList.class)
                .merge(obj);
    }


    @Processor
    public String saveItemCategory(@Payload ItemCategory obj) {
        return this.config.getClientProvider()
                .getClient(ItemCategory.class)
                .merge(obj);
    }

    
    @Processor
    public String saveTaxList(@Payload TaxList obj) {
        return this.config.getClientProvider()
                .getClient(TaxList.class)
                .merge(obj);
    }

    @Processor
    public String saveContact(@Payload Contact obj) {
        return this.config.getClientProvider()
                .getClient(Contact.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomer(@Payload Customer obj) {
        return this.config.getClientProvider()
                .getClient(Customer.class)
                .merge(obj);
    }

    @Processor
    public String saveItemAttribute(@Payload ItemAttribute obj) {
        return this.config.getClientProvider()
                .getClient(ItemAttribute.class)
                .merge(obj);
    }
    
    @Processor
    public String saveAttribute(@Payload Attribute obj) {
        return this.config.getClientProvider()
                .getClient(Attribute.class)
                .merge(obj);
    }

    @Processor
    public String saveEmployee(@Payload Employee obj) {
        return this.config.getClientProvider()
                .getClient(Employee.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroup(@Payload CustomerGroup obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroup.class)
                .merge(obj);
    }
    
    @Processor
    public String saveCustomerEmployee(@Payload CustomerEmployee obj) {
        return this.config.getClientProvider()
                .getClient(CustomerEmployee.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroupAssign(@Payload CustomerGroupAssign obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupAssign.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroupPriceList(@Payload CustomerGroupPriceList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupPriceList.class)
                .merge(obj);
    }
    
    @Processor
    public String saveUserAuthority(@Payload UserAuthority obj) {
        return this.config.getClientProvider()
                .getClient(UserAuthority.class)
                .merge(obj);
    }

    @Processor
    public String saveAuthority(@Payload Authority obj) {
        return this.config.getClientProvider()
                .getClient(Authority.class)
                .merge(obj);
    }
    
    @Processor
    public String saveCustomerGroupTaxList(@Payload CustomerGroupTaxList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupTaxList.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerPaymentType(@Payload CustomerPaymentType obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPaymentType.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerPriceList(@Payload CustomerPriceList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerTaxList(@Payload CustomerTaxList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerTaxList.class)
                .merge(obj);
    }

    @Processor
    public String saveEmployeeGroup(@Payload EmployeeGroup obj) {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
                .merge(obj);
    }

    @Processor
    public String saveTax(@Payload Tax obj) {
        return this.config.getClientProvider()
                .getClient(Tax.class)
                .merge(obj);
    }

    @Processor
    public String saveItemGroup(@Payload ItemGroup obj) {
        return this.config.getClientProvider()
                .getClient(ItemGroup.class)
                .merge(obj);
    }

    @Processor
    public String saveItemGroupAssign(@Payload ItemGroupAssign obj) {
        return this.config.getClientProvider()
                .getClient(ItemGroupAssign.class)
                .merge(obj);
    }
    
    @Processor
    public String saveAttributeValue(@Payload  AttributeValue obj) {
        return this.config.getClientProvider()
                .getClient(AttributeValue.class)
                .merge(obj);
    }

    @Processor
    public String saveItemUnit(@Payload ItemUnit obj) {
        return this.config.getClientProvider()
                .getClient(ItemUnit.class)
                .merge(obj);
    }

    @Processor
    public String saveLoading(@Payload Loading obj) {
        return this.config.getClientProvider()
                .getClient(Loading.class)
                .merge(obj);
    }

    @Processor
    public String saveLoadingDetails(@Payload LoadingDetails obj) {
        return this.config.getClientProvider()
                .getClient(LoadingDetails.class)
                .merge(obj);
    }

    @Processor
    public String saveOrderDetail(@Payload OrderDetail obj) {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .merge(obj);
    }

    @Processor
    public String saveOrderPayment(@Payload OrderPayment obj) {
        return this.config.getClientProvider()
                .getClient(OrderPayment.class)
                .merge(obj);
    }

    @Processor
    public String savePrice(@Payload Price obj) {
        return this.config.getClientProvider()
                .getClient(Price.class)
                .merge(obj);
    }

    @Processor
    public String saveOrder(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Order.class)
                .merge(obj);
    }

    @Processor
    public String saveTaxType(@Payload TaxType obj) {
        return this.config.getClientProvider()
                .getClient(TaxType.class)
                .merge(obj);
    }

    @Processor
    public String saveUnit(@Payload Unit obj) {
        return this.config.getClientProvider()
                .getClient(Unit.class)
                .merge(obj);
    }

    @Processor
    public String saveUser(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(User.class)
                .merge(obj);
    }

    @Processor
    public String saveWareHouse(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(WareHouse.class)
                .merge(obj);
    }

    @Processor
    public String saveWareHouseStock(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(WareHouseStock.class)
                .merge(obj);
    }

}
