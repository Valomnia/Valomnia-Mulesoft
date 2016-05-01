/**
 *
 */
package org.mule.modules.valomnia.entities;

public class WareHouseStock {
	private String id;

	private String organization;

	private String unitReference;

	private String itemReference;

	private String lastUpdated;

	private String dateCreated;

	private String quantity;

	private String warehouseReference;

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

	public String getUnitReference() {
		return unitReference;
	}

	public void setUnitReference(String unitReference) {
		this.unitReference = unitReference;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getWarehouseReference() {
		return warehouseReference;
	}

	public void setWarehouseReference(String warehouseReference) {
		this.warehouseReference = warehouseReference;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", organization = " + organization
				+ ", unitReference = " + unitReference + ", itemReference = "
				+ itemReference + ", lastUpdated = " + lastUpdated
				+ ", dateCreated = " + dateCreated + ", quantity = " + quantity
				+ ", warehouseReference = " + warehouseReference + "]";
	}
}
