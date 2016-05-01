/**
 *
 */
package org.mule.modules.valomnia.entities;

public class Attribute {

    private String id;

    private String organization;

    private String name;

    private String lastUpdated;

    private String dateCreated;

    private String type;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                + ", name = " + name + ", lastUpdated = " + lastUpdated
                + ", dateCreated = " + dateCreated + ", type = " + type
                + ", reference = " + reference + "]";
    }
}
