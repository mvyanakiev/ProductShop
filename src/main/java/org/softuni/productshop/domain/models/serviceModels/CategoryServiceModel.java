package org.softuni.productshop.domain.models.serviceModels;

public class CategoryServiceModel extends BaseServiceModel {

    private String name;

    public CategoryServiceModel() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}