/**
 *
 */
package org.mule.modules.valomnia.entities;

public class CustomerGroupTaxList {
	private String id;

	private String organization;

	private String customerGroupReference;

	private String lastUpdated;

	private String dateCreated;

	private String taxListName;

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

	public String getCustomerGroupReference() {
		return customerGroupReference;
	}

	public void setCustomerGroupReference(String customerGroupReference) {
		this.customerGroupReference = customerGroupReference;
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

	public String getTaxListName() {
		return taxListName;
	}

	public void setTaxListName(String taxListName) {
		this.taxListName = taxListName;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", customerGroupReference = " + customerGroupReference
				+ ", lastUpdated = " + lastUpdated + ", dateCreated = "
				+ dateCreated + ", taxListName = " + taxListName + "]";
	}
}
