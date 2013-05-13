package com.nwea.portal.domain;

import com.nwea.portal.repository.ZuoraRepository;
import com.zuora.api.object.Product;

public class OrderSummary {

    private OrderItem[] orderItems;

    private ZuoraRepository zr;

    public OrderSummary(ZuoraRepository zr) {
        this.zr = zr;
    }

    public OrderItem[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(OrderItem[] orderItems) {
        this.orderItems = orderItems;
    }

    public void Build(String[] productIds, String[] quantities, String[] prices) throws Exception {

        orderItems = new OrderItem[productIds.length];
        for (int i = 0; i < productIds.length; i++) {
            Product p = this.zr.ProductR.GetById(productIds[i]);
            OrderItem oi = new OrderItem(prices[i].substring(1),
                    Integer.parseInt(quantities[i]), p.getName());
            orderItems[i] = oi;
        }
    }

}
