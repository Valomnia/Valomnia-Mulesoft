
package org.mule.modules.valomnia.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/valomnia</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-05-10T01:30:35+01:00", comments = "Build UNNAMED.2762.e3b1307")
public class ValomniaNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(ValomniaNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [valomnia] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [valomnia] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new ValomniaConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-items", new FindItemsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-items", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers", new FindCustomersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-attributs", new FindAttributsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-attributs", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-items-attribute", new FindItemsAttributeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-items-attribute", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-orders", new FindOrdersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-orders", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-items-group", new FindItemsGroupDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-items-group", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-items-group-assign", new FindItemsGroupAssignDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-items-group-assign", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-units", new FindUnitsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-units", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-item-units", new FindItemUnitsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-item-units", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-tax-types", new FindTaxTypesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-tax-types", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-tax-lists", new FindTaxListsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-tax-lists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-taxs", new FindTaxsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-taxs", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-price-lists", new FindPriceListsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-price-lists", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-prices", new FindPricesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-prices", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-orders-detail", new FindOrdersDetailDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-orders-detail", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-category", new FindCustomersCategoryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-category", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-contacts", new FindContactsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-contacts", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-group", new FindCustomersGroupDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-group", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-group-assign", new FindCustomersGroupAssignDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-group-assign", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-group-price-list", new FindCustomersGroupPriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-group-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-group-tax-list", new FindCustomersGroupTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-group-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-category-price-list", new FindCustomersCategoryPriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-category-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-category-tax-list", new FindCustomersCategoryTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-category-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-payment-type", new FindCustomersPaymentTypeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-payment-type", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-price-list", new FindCustomersPriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-tax-list", new FindCustomersTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-ware-houses", new FindWareHousesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-ware-houses", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-ware-house-stocks", new FindWareHouseStocksDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-ware-house-stocks", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-orders-details", new FindOrdersDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-orders-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-employee-groups", new FindEmployeeGroupsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-employee-groups", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-employees", new FindEmployeesDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-employees", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-users", new FindUsersDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-users", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-authority", new FindAuthorityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-authority", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-users-authority", new FindUsersAuthorityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-users-authority", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-loadings", new FindLoadingsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-loadings", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-attributes-value", new FindAttributesValueDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-attributes-value", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-loading-details", new FindLoadingDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-loading-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-customers-employee", new FindCustomersEmployeeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-customers-employee", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-orders-payment", new FindOrdersPaymentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-orders-payment", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-items-category", new FindItemsCategoryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-items-category", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-item", new SaveItemDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-item", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-category-price-list", new SaveCustomerCategoryPriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-category-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-category", new SaveCustomerCategoryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-category", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-price-list", new SavePriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-category-tax-list", new SaveCustomerCategoryTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-category-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-item-category", new SaveItemCategoryDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-item-category", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-tax-list", new SaveTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-contact", new SaveContactDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-contact", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer", new SaveCustomerDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-item-attribute", new SaveItemAttributeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-item-attribute", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-attribute", new SaveAttributeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-attribute", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-employee", new SaveEmployeeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-employee", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-group", new SaveCustomerGroupDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-group", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-employee", new SaveCustomerEmployeeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-employee", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-group-assign", new SaveCustomerGroupAssignDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-group-assign", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-group-price-list", new SaveCustomerGroupPriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-group-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-user-authority", new SaveUserAuthorityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-user-authority", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-authority", new SaveAuthorityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-authority", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-group-tax-list", new SaveCustomerGroupTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-group-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-payment-type", new SaveCustomerPaymentTypeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-payment-type", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-price-list", new SaveCustomerPriceListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-price-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-customer-tax-list", new SaveCustomerTaxListDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-customer-tax-list", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-employee-group", new SaveEmployeeGroupDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-employee-group", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-tax", new SaveTaxDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-tax", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-item-group", new SaveItemGroupDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-item-group", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-item-group-assign", new SaveItemGroupAssignDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-item-group-assign", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-attribute-value", new SaveAttributeValueDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-attribute-value", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-item-unit", new SaveItemUnitDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-item-unit", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-loading", new SaveLoadingDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-loading", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-loading-details", new SaveLoadingDetailsDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-loading-details", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-order-detail", new SaveOrderDetailDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-order-detail", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-order-payment", new SaveOrderPaymentDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-order-payment", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-price", new SavePriceDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-price", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-order", new SaveOrderDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-order", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-tax-type", new SaveTaxTypeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-tax-type", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-unit", new SaveUnitDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-unit", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-user", new SaveUserDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-user", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-ware-house", new SaveWareHouseDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-ware-house", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("save-ware-house-stock", new SaveWareHouseStockDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("save-ware-house-stock", "@Processor", ex);
        }
    }

}
