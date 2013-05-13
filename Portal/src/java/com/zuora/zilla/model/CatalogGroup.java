package com.zuora.zilla.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class CatalogGroup {

    private String name = "";
    private ArrayList<CatalogProduct> products;

    public CatalogGroup() {
        this.name = "";
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("products")
    public ArrayList<CatalogProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<CatalogProduct> products) {
        this.products = products;
    }
}
