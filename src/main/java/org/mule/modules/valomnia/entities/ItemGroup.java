/**
 *
 */
package org.mule.modules.valomnia.entities;

public class ItemGroup {
	private String id;

	private String organization;

	private String description;

	private String name;

	private String lastUpdated;

	private String dateCreated;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", description = " + description + ", name = " + name
				+ ", lastUpdated = " + lastUpdated + ", dateCreated = "
				+ dateCreated + ", reference = " + reference + "]";
	}
}