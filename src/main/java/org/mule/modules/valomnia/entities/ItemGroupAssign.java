/**
 *
 */
package org.mule.modules.valomnia.entities;

public class ItemGroupAssign {
	private String id;

	private String organization;

	private String itemReference;

	private String lastUpdated;

	private String dateCreated;

	private String itemGroupReference;

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

	public String getItemReference() {
		return itemReference;
	}

	public void setItemReference(String itemReference) {
		this.itemReference = itemReference;
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

	public String getItemGroupReference() {
		return itemGroupReference;
	}

	public void setItemGroupReference(String itemGroupReference) {
		this.itemGroupReference = itemGroupReference;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", itemReference = " + itemReference + ", lastUpdated = "
				+ lastUpdated + ", dateCreated = " + dateCreated
				+ ", itemGroupReference = " + itemGroupReference + "]";
	}
}