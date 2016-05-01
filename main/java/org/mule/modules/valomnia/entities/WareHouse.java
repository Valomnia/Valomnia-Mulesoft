/**
 *
 */
package org.mule.modules.valomnia.entities;

public class WareHouse {
	private String id;

	private String organization;

	private String address;

	private String description;

	private String employeeReference;

	private String name;

	private String isVan;

	private String lastUpdated;

	private String dateCreated;

	private String parentReference;

	private String reference;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployeeReference() {
		return employeeReference;
	}

	public void setEmployeeReference(String employeeReference) {
		this.employeeReference = employeeReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsVan() {
		return isVan;
	}

	public void setIsVan(String isVan) {
		this.isVan = isVan;
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

	public String getParentReference() {
		return parentReference;
	}

	public void setParentReference(String parentReference) {
		this.parentReference = parentReference;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", address = " + address + ", description = " + description
				+ ", employeeReference = " + employeeReference + ", name = "
				+ name + ", isVan = " + isVan + ", lastUpdated = "
				+ lastUpdated + ", dateCreated = " + dateCreated
				+ ", parentReference = " + parentReference + ", reference = "
				+ reference + "]";
	}
}
