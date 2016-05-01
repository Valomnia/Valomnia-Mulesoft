/**
 *
 */
package org.mule.modules.valomnia.entities;

import java.util.Date;

public class PriceList {
	private String id;

	private Date startDate;

	private String organization;

	private String name;

	private String lastUpdated;

	private String dateCreated;

	private Date endDate;

	private String always;

	private String reference;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
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

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getAlways() {
		return always;
	}

	public void setAlways(String always) {
		this.always = always;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", startDate = " + startDate
				+ ", organization = " + organization + ", name = " + name
				+ ", lastUpdated = " + lastUpdated + ", dateCreated = "
				+ dateCreated + ", endDate = " + endDate + ", always = "
				+ always + ", reference = " + reference + "]";
	}
}
