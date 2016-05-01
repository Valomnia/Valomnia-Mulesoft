/**
 *
 */
package org.mule.modules.valomnia.entities;

public class Authority {

    private String organization;

    private String name;

    private String lastUpdated;

    private String dateCreated;

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

    @Override
    public String toString() {
        return "ClassPojo [organization = " + organization + ", name = " + name
                + ", lastUpdated = " + lastUpdated + ", dateCreated = "
                + dateCreated + "]";
    }
}
