/**
 *
 */
package org.mule.modules.valomnia.entities;

public class CustomerEmployee {
	private String id;

	private String organization;

	private String employeeReference;

	private String lastUpdated;

	private String dateCreated;

	private String customerReference;

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

	public String getEmployeeReference() {
		return employeeReference;
	}

	public void setEmployeeReference(String employeeReference) {
		this.employeeReference = employeeReference;
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

	public String getCustomerReference() {
		return customerReference;
	}

	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", employeeReference = " + employeeReference
				+ ", lastUpdated = " + lastUpdated + ", dateCreated = "
				+ dateCreated + ", customerReference = " + customerReference
				+ "]";
	}
}
