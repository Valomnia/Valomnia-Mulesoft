/**
 *
 */
package org.mule.modules.valomnia.entities;

public class UserAuthority {
	private String lastUpdated;

	private String dateCreated;

	private String userEmail;

	private String authorityName;

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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	@Override
	public String toString() {
		return "ClassPojo [lastUpdated = " + lastUpdated + ", dateCreated = "
				+ dateCreated + ", userEmail = " + userEmail
				+ ", authorityName = " + authorityName + "]";
	}
}
