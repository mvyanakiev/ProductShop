package org.softuni.productshop.domain.models.serviceModels;

public abstract class BaseServiceModel {

    private String id;

    protected BaseServiceModel() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
