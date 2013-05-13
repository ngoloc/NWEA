package com.nwea.portal.domain;

import java.math.BigDecimal;

public class OrderItem {

    private String price;

    private int quantity;

    private String name;

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public OrderItem(String price, int q, String n) {
        this.price = price;
        this.quantity = q;
        this.name = n;
        BigDecimal bd = new BigDecimal(price);
        this.total = bd.intValue() * q;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
