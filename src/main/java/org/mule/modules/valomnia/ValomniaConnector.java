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

/**
 * Mule Connector for Valomnia
 * 
 * @author MuleSoft, Inc.
 */

@Connector(name = "valomnia", friendlyName = "Valomnia Connector", minMuleVersion="3.7.0")
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
     *  
     */

    @Processor
    public ArrayList<Item> findItems() {
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
     *   
     */

    @Processor
    public ArrayList<Customer> findCustomers() {

        return this.config.getClientProvider()
                .getClient(Customer.class)
                .getAll();

    }
    
    /**
     * Find all Attributs for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-attributs}
     *
     * @return a List of all the Attributs
     *  
     */

    @Processor
    public ArrayList<Attribute> findAttributs()    {

        return this.config.getClientProvider()
                .getClient(Attribute.class)
                .getAll();

    }
    
    
    /**
     * Find all Items Attribute for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-items-attribute}
     *
     * @return a List of all the  Items Attribute 
     *  
     */
    
    @Processor
    public ArrayList<ItemAttribute> findItemsAttribute()    {

        return this.config.getClientProvider()
                .getClient(ItemAttribute.class)
                .getAll();

    }
    
    /**
     * Find all Items Orders for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-orders}
     *
     * @return a List of all the Orders
     *   
     */

    @Processor
    public ArrayList<Order> findOrders()    {
        return this.config.getClientProvider()
                .getClient(Order.class)
                .getAll();
    }
    
    /**
     * Find all Items Group for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-items-group}
     *
     * @return a List of all the Items  Group
     *  
     */


    @Processor
    public ArrayList<ItemGroup> findItemsGroup()    {
        return this.config.getClientProvider()
                .getClient(ItemGroup.class)
                .getAll();
    }

    /**
     * Find all Items Group Assign for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-items-group-assign}
     *
     * @return a List of all the Items Group Assign
     *  
     */
    
    
    @Processor
    public ArrayList<ItemGroupAssign> findItemsGroupAssign()    {
        return this.config.getClientProvider()
                .getClient(ItemGroupAssign.class)
                .getAll();
    }
    
    /**
     * Find all Units for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-units}
     *
     * @return a List of all the Units
     *   
     */

    @Processor
    public ArrayList<Unit> findUnits()    {
        return this.config.getClientProvider()
                .getClient(Unit.class)
                .getAll();
    }
    /**
     * Find all Item Units for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-item-units}
     *
     * @return a List of all the Item Units
     * 
     */

    @Processor
    public ArrayList<ItemUnit> findItemUnits()    {
        return this.config.getClientProvider()
                .getClient(ItemUnit.class)
                .getAll();
    }
    
    /**
     * Find all Tax Type for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-tax-types}
     *
     * @return a List of all the TaxType
     *  
     */

    @Processor
    public ArrayList<TaxType> findTaxTypes()    {
        return this.config.getClientProvider()
                .getClient(TaxType.class)
                .getAll();
    }
    
    /**
     * Find all TaxLists for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-tax-lists}
     *
     * @return a List of all the TaxList
     * 
     */

    @Processor
    public ArrayList<TaxList> findTaxLists()    {
        return this.config.getClientProvider()
                .getClient(TaxList.class)
                .getAll();
    }
    /**
     * Find all Taxs for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-taxs}
     *
     * @return a List of all the Taxs
     *  
     */

    @Processor
    public ArrayList<Tax> findTaxs()    {
        return this.config.getClientProvider()
                .getClient(Tax.class)
                .getAll();
    }

    
    /**
     * Find all Price Lists for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-price-lists}
     *
     * @return a List of all the Price Lists
     *  
     */
    @Processor
    public ArrayList<PriceList> findPriceLists()    {
        return this.config.getClientProvider()
                .getClient(PriceList.class)
                .getAll();
    }
    
    
    /**
     * Find all Prices for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-prices}
     *
     * @return a List of all the Prices
     *   
     */

    @Processor
    public ArrayList<Price> findPrices()    {
        return this.config.getClientProvider()
                .getClient(Price.class)
                .getAll();
    }
    
    
    /**
     * Find all Orders Detail for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-orders-detail}
     *
     * @return a List of all the Orders Detail
     *   
     */
    
    @Processor
    public ArrayList<OrderDetail> findOrdersDetail()    {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .getAll();
    }

    /**
     * Find all Customers Category for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-category}
     *
     * @return a List of all the Customers Category
     * 
     */
    @Processor
    public ArrayList<CustomerCategory> findCustomersCategory()    {
        return this.config.getClientProvider()
                .getClient(CustomerCategory.class)
                .getAll();
    }

    
    /**
     * Find all Contacts  for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-contacts}
     *
     * @return a List of all the Contacts
     * 
     */
    @Processor
    public ArrayList<Contact> findContacts()    {
        return this.config.getClientProvider()
                .getClient(Contact.class)
                .getAll();
    }
    
    
    /**
     * Find all Customers Group for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-group}
     *
     * @return a List of all the Customers Group
     *   
     */
    @Processor
    public ArrayList<CustomerGroup> findCustomersGroup()    {
        return this.config.getClientProvider()
                .getClient(CustomerGroup.class)
                .getAll();
    }
    
    /**
     * Find all Customers Group Assign for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-group-assign}
     *
     * @return a List of all the Customers Group Assign
     * 
     */

    @Processor
    public ArrayList<CustomerGroupAssign> findCustomersGroupAssign()    {
        return this.config.getClientProvider()
                .getClient(CustomerGroupAssign.class)
                .getAll();
    }

    
    /**
     * Find all Customers Group Price List for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-group-price-list}
     *
     * @return a List of all the Customers Group  Price List
     *  
     */
    @Processor
    public ArrayList<CustomerGroupPriceList> findCustomersGroupPriceList()
               {
        return this.config.getClientProvider()
                .getClient(CustomerGroupPriceList.class)
                .getAll();
    }

    
    
    /**
     * Find all Customers Group Tax List for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-group-tax-list}
     *
     * @return a List of all the Customers Group Tax List
     *   
     */
    @Processor
    public ArrayList<CustomerGroupTaxList> findCustomersGroupTaxList()
               {
        return this.config.getClientProvider()
                .getClient(CustomerGroupTaxList.class)
                .getAll();
    }
    
    /**
     * Find all Customers Category Price List for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-category-price-list}
     *
     * @return a List of all the Customers Category Price List
     *   
     */

    @Processor
    public ArrayList<CustomerCategoryPriceList> findCustomersCategoryPriceList()
               {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryPriceList.class)
                .getAll();
    }
    
    /**
     * Find all Customers Category  Tax List for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-category-tax-list}
     *
     * @return a List of all the Customers Category Tax List
     *  
     */

    @Processor
    public ArrayList<CustomerCategoryTaxList> findCustomersCategoryTaxList()
               {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryTaxList.class)
                .getAll();
    }
    
    /**
     * Find all Customers Payment Type for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-payment-type}
     *
     * @return a List of all the Customers  Payment Type
     *   
     */

    @Processor
    public ArrayList<CustomerPaymentType> findCustomersPaymentType()    {
        return this.config.getClientProvider()
                .getClient(CustomerPaymentType.class)
                .getAll();
    }
    
    /**
     * Find all Customers Price List  for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-price-list}
     *
     * @return a List of all the Customers Price List
     *   
     */

    @Processor
    public ArrayList<CustomerPriceList> findCustomersPriceList()    {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .getAll();
    }
    
    /**
     * Find all Customers Tax list for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-tax-list}
     *
     * @return a List of all the Customers Tax List
     *  
     */

    @Processor
    public ArrayList<CustomerTaxList> findCustomersTaxList()    {
        return this.config.getClientProvider()
                .getClient(CustomerTaxList.class)
                .getAll();
    }
    
    /**
     * Find all WareHouses for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-ware-houses}
     *
     * @return a List of all the WareHouses
     *   
     */

    @Processor
    public ArrayList<WareHouse> findWareHouses()    {
        return this.config.getClientProvider()
                .getClient(WareHouse.class)
                .getAll();
    }
    
    /**
     * Find all WareHouses Stocks for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-ware-house-stock}
     *
     * @return a List of all the WareHouses Stocks
     *  
     */

    @Processor
    public ArrayList<WareHouseStock> findWareHouseStocks()    {
        return this.config.getClientProvider()
                .getClient(WareHouseStock.class)
                .getAll();
    }

    
    
    
    
    /**
     * Find all Employee Groups  for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-employee-groups}
     *
     * @return a List of all the Employee Group
     *   
     */

    @Processor
    public ArrayList<EmployeeGroup> findEmployeeGroups()    {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
                .getAll();
    }
    /**
     * Find all Employees  for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-employees}
     *
     * @return a List of all the Employee
     *   
     */

    @Processor
    public ArrayList<Employee> findEmployees()    {
        return this.config.getClientProvider()
                .getClient(Employee.class)
                .getAll();
    }
    /**
     * Find all Users for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-users}
     *
     * @return a List of all the Users
     * 
     */

    @Processor
    public ArrayList<User> findUsers()    {
        return this.config.getClientProvider()
                .getClient(User.class)
                .getAll();
    }
    
    /**
     * Find all Authority for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-authority}
     *
     * @return a List of all the  Authority 
     *  
     */

    @Processor
    public ArrayList<Authority> findAuthority()    {
        return this.config.getClientProvider()
                .getClient(Authority.class)
                .getAll();
    }
    
    /**
     * Find all  User Authority for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-users-authority}
     *
     * @return a List of all the   User Authority 
     *  
     */

    @Processor
    public ArrayList<UserAuthority> findUsersAuthority()    {
        return this.config.getClientProvider()
                .getClient(UserAuthority.class)
                .getAll();
    }
    
    /**
     * Find all Loadings for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-loadings}
     *
     * @return a List of all the  Loadings 
     * 
     */

    @Processor
    public ArrayList<Loading> findLoadings()    {
        return this.config.getClientProvider()
                .getClient(Loading.class)
                .getAll();
    }
    
    /**
     * Find all Attributes Value for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-attributes-value}
     *
     * @return a List of all the  Attributes Value
     *   
     */
    
    
    
    @Processor
    public ArrayList<AttributeValue> findAttributesValue()    {
        return this.config.getClientProvider()
                .getClient(AttributeValue.class)
                .getAll();
    }
    
    /**
     * Find all Loading Details for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-loading-details}
     *
     * @return a List of all the  Loading Details
     *   
     */

    @Processor
    public ArrayList<LoadingDetails> findLoadingDetails()    {
        return this.config.getClientProvider()
                .getClient(LoadingDetails.class)
                .getAll();
    }
    
    /**
     * Find all Customers Employee for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-customers-employee}
     *
     * @return a List of all the  Loadings 
     * 
     */

    @Processor
    public ArrayList<CustomerEmployee> findCustomersEmployee()    {
        return this.config.getClientProvider()
                .getClient(CustomerEmployee.class)
                .getAll();
    }
    
    /**
     * Find all Orders Payment  for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-orders-payment}
     *
     * @return a List of all the  Orders Payment
     *  
     */
    
    @Processor
    public ArrayList<OrderPayment> findOrdersPayment()    {
        return this.config.getClientProvider()
                .getClient(OrderPayment.class)
                .getAll();
    }

    /**
     * Find all Items Category for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:find-items-category}
     *
     * @return a List of all the  Items Category 
     *  
     */
    
    
    @Processor
    public ArrayList<ItemCategory> findItemsCategory()    {
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
    
    /**
     * Save Or Update an CustomerCategoryPriceList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-category-price-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    @Processor
    public String saveCustomerCategoryPriceList(@Payload CustomerCategoryPriceList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryPriceList.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerCategory entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-category}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    
    @Processor
    public String saveCustomerCategory(@Payload CustomerCategory obj) {
        return this.config.getClientProvider()
                .getClient(CustomerCategory.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an PriceList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-price-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    
    @Processor
    public String savePriceList(@Payload PriceList obj) {
        return this.config.getClientProvider()
                .getClient(PriceList.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerCategoryTaxList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-category-tax-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
   
    
    @Processor
    public String saveCustomerCategoryTaxList(@Payload CustomerCategoryTaxList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryTaxList.class)
                .merge(obj);
    }

    /**
     * Save Or Update an ItemCategory entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-item-category}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
   

    @Processor
    public String saveItemCategory(@Payload ItemCategory obj) {
        return this.config.getClientProvider()
                .getClient(ItemCategory.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an TaxList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-tax-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    @Processor
    public String saveTaxList(@Payload TaxList obj) {
        return this.config.getClientProvider()
                .getClient(TaxList.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an Contact entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-contact}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
   

    @Processor
    public String saveContact(@Payload Contact obj) {
        return this.config.getClientProvider()
                .getClient(Contact.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an Customer entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveCustomer(@Payload Customer obj) {
        return this.config.getClientProvider()
                .getClient(Customer.class)
                .merge(obj);
    }
    /**
     * Save Or Update an ItemAttribute entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-item-attribute}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveItemAttribute(@Payload ItemAttribute obj) {
        return this.config.getClientProvider()
                .getClient(ItemAttribute.class)
                .merge(obj);
    }
    /**
     * Save Or Update an Attribute entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-attribute}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    @Processor
    public String saveAttribute(@Payload Attribute obj) {
        return this.config.getClientProvider()
                .getClient(Attribute.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an Employee entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-employee}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveEmployee(@Payload Employee obj) {
        return this.config.getClientProvider()
                .getClient(Employee.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an CustomerGroup entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-group}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveCustomerGroup(@Payload CustomerGroup obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroup.class)
                .merge(obj);
    }
    
    
    /**
     * Save Or Update an CustomerEmployee entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-employee}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveCustomerEmployee(@Payload CustomerEmployee obj) {
        return this.config.getClientProvider()
                .getClient(CustomerEmployee.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerGroupAssign entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-group-assign}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveCustomerGroupAssign(@Payload CustomerGroupAssign obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupAssign.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an CustomerGroupPriceList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-group-price-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveCustomerGroupPriceList(@Payload CustomerGroupPriceList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupPriceList.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an UserAuthority entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-user-authority}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    @Processor
    public String saveUserAuthority(@Payload UserAuthority obj) {
        return this.config.getClientProvider()
                .getClient(UserAuthority.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an Authority entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-authority}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveAuthority(@Payload Authority obj) {
        return this.config.getClientProvider()
                .getClient(Authority.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerGroupTaxList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-group-tax-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    
    @Processor
    public String saveCustomerGroupTaxList(@Payload CustomerGroupTaxList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupTaxList.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerPaymentType entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-payment-type}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveCustomerPaymentType(@Payload CustomerPaymentType obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPaymentType.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerPriceList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-price-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveCustomerPriceList(@Payload CustomerPriceList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an CustomerTaxList entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-customer-tax-list}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveCustomerTaxList(@Payload CustomerTaxList obj) {
        return this.config.getClientProvider()
                .getClient(CustomerTaxList.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an EmployeeGroup entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-employee-group}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveEmployeeGroup(@Payload EmployeeGroup obj) {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
                .merge(obj);
    }
    /**
     * Save Or Update an Tax entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-tax}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveTax(@Payload Tax obj) {
        return this.config.getClientProvider()
                .getClient(Tax.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an ItemGroup entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-item-group}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveItemGroup(@Payload ItemGroup obj) {
        return this.config.getClientProvider()
                .getClient(ItemGroup.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an ItemGroupAssign entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-item-group-assign}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveItemGroupAssign(@Payload ItemGroupAssign obj) {
        return this.config.getClientProvider()
                .getClient(ItemGroupAssign.class)
                .merge(obj);
    }
    
    
    /**
     * Save Or Update an AttributeValue entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-attribute-value}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveAttributeValue(@Payload  AttributeValue obj) {
        return this.config.getClientProvider()
                .getClient(AttributeValue.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an ItemUnit entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-item-unit}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveItemUnit(@Payload ItemUnit obj) {
        return this.config.getClientProvider()
                .getClient(ItemUnit.class)
                .merge(obj);
    }

    /**
     * Save Or Update an Loading entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-loading}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveLoading(@Payload Loading obj) {
        return this.config.getClientProvider()
                .getClient(Loading.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an LoadingDetails entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-loading-details}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveLoadingDetails(@Payload LoadingDetails obj) {
        return this.config.getClientProvider()
                .getClient(LoadingDetails.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an OrderDetail entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-order-detail}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveOrderDetail(@Payload OrderDetail obj) {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .merge(obj);
    }
    /**
     * Save Or Update an OrderPayment entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-order-payment}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveOrderPayment(@Payload OrderPayment obj) {
        return this.config.getClientProvider()
                .getClient(OrderPayment.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an Price entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-price}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String savePrice(@Payload Price obj) {
        return this.config.getClientProvider()
                .getClient(Price.class)
                .merge(obj);
    }
    /**
     * Save Or Update an Order entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-order}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveOrder(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Order.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an TaxType entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-tax-type}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveTaxType(@Payload TaxType obj) {
        return this.config.getClientProvider()
                .getClient(TaxType.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an Unit entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-unit}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveUnit(@Payload Unit obj) {
        return this.config.getClientProvider()
                .getClient(Unit.class)
                .merge(obj);
    }
    
    /**
     * Save Or Update an User entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-user}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */

    @Processor
    public String saveUser(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(User.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an WareHouse entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-ware-house}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveWareHouse(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(WareHouse.class)
                .merge(obj);
    }

    
    /**
     * Save Or Update an WareHouseStock entity for the connected account
     *
     * { @sample.xml /valomnia-connector/doc/valomnia-connector.xml.sample valomnia:save-ware-house-stock}
     * 
     * @param obj
     *            the input object saved or updated
     * @return response String for Valomnia API
     */
    @Processor
    public String saveWareHouseStock(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(WareHouseStock.class)
                .merge(obj);
    }

}
