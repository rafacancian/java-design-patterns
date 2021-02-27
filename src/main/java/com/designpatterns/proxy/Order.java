package com.designpatterns.proxy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements OrderCommon {

    private BigDecimal value;
    private String code;
    private List<OrderCommon> items;

    public Order(String code) {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
        this.code = code;
    }

    public void addItem(OrderCommon item) {
        this.value = value.add(item.getValue());
        items.add(item);
    }


    public BigDecimal getValue() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // do nothing
        }
        return value;
    }

    public String getCode() {
        return code;
    }

    public List<OrderCommon> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", code='" + code + '\'' +
                ", items=" + items +
                '}';
    }
}
