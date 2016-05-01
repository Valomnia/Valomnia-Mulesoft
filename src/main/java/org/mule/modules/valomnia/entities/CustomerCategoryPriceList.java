/**
 *
 */
package org.mule.modules.valomnia.entities;

public class CustomerCategoryPriceList {
	private String id;

	private String organization;

	private String customerCategoryReference;

	private String priceListReference;

	private String lastUpdated;

	private String dateCreated;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getCustomerCategoryReference() {
		return customerCategoryReference;
	}

	public void setCustomerCategoryReference(String customerCategoryReference) {
		this.customerCategoryReference = customerCategoryReference;
	}

	public String getPriceListReference() {
		return priceListReference;
	}

	public void setPriceListReference(String priceListReference) {
		this.priceListReference = priceListReference;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", customerCategoryReference = " + customerCategoryReference
				+ ", priceListReference = " + priceListReference
				+ ", lastUpdated = " + lastUpdated + ", dateCreated = "
				+ dateCreated + "]";
	}
}
