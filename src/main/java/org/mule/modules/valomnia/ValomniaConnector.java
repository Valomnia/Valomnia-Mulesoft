package org.mule.modules.valomnia;
/**
 *
 */


import java.util.List;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Payload;
import org.mule.modules.valomnia.core.ConnectorConfig;
import org.mule.modules.valomnia.entities.Attribute;
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
    public List<Item> findItems() throws Exception {
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
    public List<Customer> findCustomers() throws Exception {

        return this.config.getClientProvider()
                .getClient(Customer.class)
                .getAll();

    }

    @Processor
    public List<Attribute> findAttributs() throws Exception {

        return this.config.getClientProvider()
                .getClient(Attribute.class)
                .getAll();

    }

    @Processor
    public List<Order> findOrders() throws Exception {
        return this.config.getClientProvider()
                .getClient(Order.class)
                .getAll();
    }

    @Processor
    public List<ItemGroup> findItemsGroup() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemGroup.class)
                .getAll();
    }

    @Processor
    public List<ItemGroupAssign> findItemGroupAssign() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemGroupAssign.class)
                .getAll();
    }

    @Processor
    public List<Unit> findUnits() throws Exception {
        return this.config.getClientProvider()
                .getClient(Unit.class)
                .getAll();
    }

    @Processor
    public List<ItemUnit> findItemUnits() throws Exception {
        return this.config.getClientProvider()
                .getClient(ItemUnit.class)
                .getAll();
    }

    @Processor
    public List<TaxType> findTaxTypes() throws Exception {
        return this.config.getClientProvider()
                .getClient(TaxType.class)
                .getAll();
    }

    @Processor
    public List<TaxList> findTaxLists() throws Exception {
        return this.config.getClientProvider()
                .getClient(TaxList.class)
                .getAll();
    }

    @Processor
    public List<Tax> findTaxs() throws Exception {
        return this.config.getClientProvider()
                .getClient(Tax.class)
                .getAll();
    }

    @Processor
    public List<PriceList> findPriceLists() throws Exception {
        return this.config.getClientProvider()
                .getClient(PriceList.class)
                .getAll();
    }

    @Processor
    public List<Price> findPrices() throws Exception {
        return this.config.getClientProvider()
                .getClient(Price.class)
                .getAll();
    }

    @Processor
    public List<CustomerCategory> findCustomerCategory() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerCategory.class)
                .getAll();
    }

    @Processor
    public List<Contact> findContacts() throws Exception {
        return this.config.getClientProvider()
                .getClient(Contact.class)
                .getAll();
    }

    @Processor
    public List<CustomerGroupAssign> findCustomerGroupAssign() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroupAssign.class)
                .getAll();
    }

    @Processor
    public List<CustomerGroupPriceList> findCustomerGroupPriceList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroupPriceList.class)
                .getAll();
    }

    @Processor
    public List<CustomerGroupTaxList> findCustomerGroupTaxList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerGroupTaxList.class)
                .getAll();
    }

    @Processor
    public List<CustomerCategoryPriceList> findCustomerCategroryPriceList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryPriceList.class)
                .getAll();
    }

    @Processor
    public List<CustomerCategoryTaxList> findCustomerCategroryTaxList()
            throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerCategoryTaxList.class)
                .getAll();
    }

    @Processor
    public List<CustomerPaymentType> findCustomerPaymentType() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerPaymentType.class)
                .getAll();
    }

    @Processor
    public List<CustomerPriceList> findCustomerPriceList() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .getAll();
    }

    @Processor
    public List<CustomerTaxList> findCustomerTaxList() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerTaxList.class)
                .getAll();
    }

    @Processor
    public List<WareHouse> findWareHouses() throws Exception {
        return this.config.getClientProvider()
                .getClient(WareHouse.class)
                .getAll();
    }

    @Processor
    public List<WareHouseStock> findWareHouseStocks() throws Exception {
        return this.config.getClientProvider()
                .getClient(WareHouseStock.class)
                .getAll();
    }

    @Processor
    public List<OrderDetail> findOrderDetails() throws Exception {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .getAll();
    }

    @Processor
    public List<EmployeeGroup> findEmployeeGroups() throws Exception {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
                .getAll();
    }

    @Processor
    public List<Employee> findEmployees() throws Exception {
        return this.config.getClientProvider()
                .getClient(Employee.class)
                .getAll();
    }

    @Processor
    public List<User> findUsers() throws Exception {
        return this.config.getClientProvider()
                .getClient(User.class)
                .getAll();
    }

    @Processor
    public List<Authority> findAuthority() throws Exception {
        return this.config.getClientProvider()
                .getClient(Authority.class)
                .getAll();
    }

    @Processor
    public List<UserAuthority> findUserAuthority() throws Exception {
        return this.config.getClientProvider()
                .getClient(UserAuthority.class)
                .getAll();
    }

    @Processor
    public List<Loading> findLoading() throws Exception {
        return this.config.getClientProvider()
                .getClient(Loading.class)
                .getAll();
    }

    @Processor
    public List<LoadingDetails> findLoadingDetails() throws Exception {
        return this.config.getClientProvider()
                .getClient(LoadingDetails.class)
                .getAll();
    }

    @Processor
    public List<CustomerEmployee> findCustomerEmployee() throws Exception {
        return this.config.getClientProvider()
                .getClient(CustomerEmployee.class)
                .getAll();
    }

    @Processor
    public List<WareHouseStock> findWareHouseStock() throws Exception {
        return this.config.getClientProvider()
                .getClient(WareHouseStock.class)
                .getAll();
    }

    @Processor
    public List<EmployeeGroup> findEmplyeeGroup() throws Exception {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
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
    public String saveItem(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Item.class)
                .merge(obj);
    }

    @Processor
    public String saveItemCategory(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(ItemCategory.class)
                .merge(obj);
    }

    @Processor
    public String saveContact(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Contact.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomer(@Payload Object l) {
        return this.config.getClientProvider()
                .getClient(Customer.class)
                .merge(l);
    }

    @Processor
    public String saveItemAttribut(@Payload Object l) {
        return this.config.getClientProvider()
                .getClient(ItemAttribute.class)
                .merge(l);
    }

    @Processor
    public String saveEmployee(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Employee.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroup(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroup.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroupAsisgn(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupAssign.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroupPriceList(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupPriceList.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerGroupTaxList(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerGroupTaxList.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerPaymentType(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPaymentType.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerPriceList(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .merge(obj);
    }

    @Processor
    public String saveCustomerTaxList(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(CustomerPriceList.class)
                .merge(obj);
    }

    @Processor
    public String saveEmployeeGroup(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(EmployeeGroup.class)
                .merge(obj);
    }

    @Processor
    public String saveTax(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Tax.class)
                .merge(obj);
    }

    @Processor
    public String saveItemGroup(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(ItemGroup.class)
                .merge(obj);
    }

    @Processor
    public String saveItemGroupAssign(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(ItemGroupAssign.class)
                .merge(obj);
    }

    @Processor
    public String saveItemUnit(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(ItemUnit.class)
                .merge(obj);
    }

    @Processor
    public String saveLoading(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(Loading.class)
                .merge(obj);
    }

    @Processor
    public String saveLoadingDetails(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(LoadingDetails.class)
                .merge(obj);
    }

    @Processor
    public String saveOrderDetails(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(OrderDetail.class)
                .merge(obj);
    }

    @Processor
    public String saveOrderPayment(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(OrderPayment.class)
                .merge(obj);
    }

    @Processor
    public String savePrice(@Payload Object obj) {
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
    public String saveTaxType(@Payload Object obj) {
        return this.config.getClientProvider()
                .getClient(TaxType.class)
                .merge(obj);
    }

    @Processor
    public String saveUnit(@Payload Object obj) {
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
