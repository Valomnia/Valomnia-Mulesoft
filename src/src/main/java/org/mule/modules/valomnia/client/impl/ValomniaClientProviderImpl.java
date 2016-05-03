/**
 * (c) 2003-2016 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1, a copy of which has been included with this distribution in the LICENSE.md file.
 */
/**
 *
 */
package org.mule.modules.valomnia.client.impl;

import java.util.Map;

import org.mule.modules.valomnia.client.GenericValomniaClient;
import org.mule.modules.valomnia.client.ValomniaClientProvider;
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

import java.util.HashMap;

public class ValomniaClientProviderImpl implements ValomniaClientProvider {

	private Map<Class<?>, GenericValomniaClient<?>> clients;

	@SuppressWarnings("serial")
	public ValomniaClientProviderImpl(final String baseUrl, final String password,
			final String token) {
		try {

			this.clients = new HashMap<Class<?>, GenericValomniaClient<?>>() {
				{

					put(Item.class, new GenericValomniaClientImpl<Item>(baseUrl,token,
							"ItemConnector/"));
					put(Customer.class,
							new GenericValomniaClientImpl<Customer>(baseUrl,token,
									"CustomerConnector/"));
					put(Order.class, new GenericValomniaClientImpl<Order>(
							baseUrl,token, "OrdersConnector/"));
					put(ItemCategory.class,
							new GenericValomniaClientImpl<ItemCategory>(baseUrl,token,
									"ItemCategoryConnector/"));
					put(Attribute.class,
							new GenericValomniaClientImpl<Attribute>(baseUrl,token,
									"AttributeConnector/"));
					put(AttributeValue.class,
							new GenericValomniaClientImpl<AttributeValue>(
									baseUrl,token, "AttributeValueConnector/"));
					put(ItemAttribute.class,
							new GenericValomniaClientImpl<ItemAttribute>(baseUrl,token,
									"ItemAttributeConnector/"));
					put(ItemGroup.class,
							new GenericValomniaClientImpl<ItemGroup>(baseUrl,token,
									"ItemGroupConnector/"));
					put(ItemGroupAssign.class,
							new GenericValomniaClientImpl<ItemGroupAssign>(
									baseUrl,token, "ItemGroupAssignConnector/"));
					put(Unit.class, new GenericValomniaClientImpl<Unit>(baseUrl,token,
							"UnitConnector/"));
					put(ItemUnit.class,
							new GenericValomniaClientImpl<ItemUnit>(baseUrl,token,
									"ItemUnitConnector/"));
					put(TaxType.class, new GenericValomniaClientImpl<TaxType>(
							baseUrl,token, "TaxTypeConnector/"));
					put(TaxList.class, new GenericValomniaClientImpl<TaxList>(
							baseUrl,token, "TaxListConnector/"));
					put(Tax.class, new GenericValomniaClientImpl<Tax>(baseUrl,token,
							"TaxConnector/"));
					put(PriceList.class,
							new GenericValomniaClientImpl<PriceList>(baseUrl,token,
									"PriceListConnector/"));
					put(CustomerCategory.class,
							new GenericValomniaClientImpl<CustomerCategory>(
									baseUrl,token, "CustomerCategoryConnector/"));
					put(CustomerGroup.class,
							new GenericValomniaClientImpl<CustomerGroup>(baseUrl,token,
									"CustomerGroupConnector/"));
					put(Contact.class, new GenericValomniaClientImpl<Contact>(
							baseUrl,token, "ContactConnector/"));
					put(CustomerEmployee.class,
							new GenericValomniaClientImpl<Contact>(baseUrl,token,
									"customerEmployeeConnector/"));
					put(CustomerGroupAssign.class,
							new GenericValomniaClientImpl<CustomerGroupAssign>(
									baseUrl,token, "CustomerGroupAssignConnector/"));
					put(CustomerGroupPriceList.class,
							new GenericValomniaClientImpl<CustomerGroupPriceList>(
									baseUrl,token, "CustomerGroupPriceListConnector/"));
					put(CustomerGroupTaxList.class,
							new GenericValomniaClientImpl<CustomerGroupTaxList>(
									baseUrl,token, "CustomerGroupTaxListConnector/"));
					put(CustomerCategoryPriceList.class,
							new GenericValomniaClientImpl<CustomerCategoryPriceList>(
									baseUrl,token,
									"CustomerCategoryPriceListConnector/"));
					put(CustomerCategoryTaxList.class,
							new GenericValomniaClientImpl<CustomerCategoryTaxList>(
									baseUrl,token, "CustomerCategoryTaxListConnector/"));
					put(CustomerPaymentType.class,
							new GenericValomniaClientImpl<CustomerPaymentType>(
									baseUrl,token, "CustomerPaymentTypeConnector/"));
					put(CustomerPriceList.class,
							new GenericValomniaClientImpl<CustomerPriceList>(
									baseUrl,token, "CustomerPriceListConnector/"));
					put(CustomerTaxList.class,
							new GenericValomniaClientImpl<CustomerTaxList>(
									baseUrl,token, "CustomerTaxListConnector/"));
					put(WareHouse.class,
							new GenericValomniaClientImpl<WareHouse>(baseUrl,token,
									"warehouseConnector/"));
					put(WareHouseStock.class,
							new GenericValomniaClientImpl<WareHouseStock>(
									baseUrl,token, "warehouseStockConnector/"));
					put(OrderDetail.class,
							new GenericValomniaClientImpl<OrderDetail>(baseUrl,token,
									"OrderDetailConnector/"));
					put(OrderPayment.class,
							new GenericValomniaClientImpl<OrderPayment>(baseUrl,token,
									"OrderPaymentConnector/"));
					put(EmployeeGroup.class,
							new GenericValomniaClientImpl<EmployeeGroup>(baseUrl,token,
									"EmployeeGroupConnector/"));
					put(Employee.class,
							new GenericValomniaClientImpl<Employee>(baseUrl,token,
									"EmployeeConnector/"));
					put(User.class, new GenericValomniaClientImpl<User>(baseUrl,token,
							"UserConnector/"));
					put(Authority.class,
							new GenericValomniaClientImpl<Authority>(baseUrl,token,
									"AuthorityConnector/"));
					put(UserAuthority.class,
							new GenericValomniaClientImpl<UserAuthority>(baseUrl,token,
									"UserAuthorityConnector/"));
					put(Loading.class, new GenericValomniaClientImpl<Loading>(
							baseUrl,token, "LoadingConnector/"));
					put(LoadingDetails.class,
							new GenericValomniaClientImpl<LoadingDetails>(
									baseUrl,token, "LoadingDetailsConnector/"));
					put(Price.class, new GenericValomniaClientImpl<Price>(
							baseUrl,token, "PriceConnector/"));

				}
			};

		} catch (Exception e) {

			{
				e.printStackTrace();
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> GenericValomniaClient<T> getClient(final Class<T> type) {
		return (GenericValomniaClient<T>) this.clients.get(type);
	}

}
