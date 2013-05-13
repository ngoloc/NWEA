package com.nwea.portal.viewmodels;

public class RelatedProductViewModel {

    private String name;

    private String price;

    private String chargeModel;

    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChargeModel() {
        return chargeModel;
    }

    public void setChargeModel(String chargeModel) {
        this.chargeModel = chargeModel;
    }

}
