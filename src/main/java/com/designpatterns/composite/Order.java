package com.designpatterns.composite;

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

//    Used to replace this method
//    public void addItem(Order order) {
//        order.getItems().forEach(or -> {
//            this.value = value.add(or.getValue());
//            items.add(or);
//        });
//    }

    public BigDecimal getValue() {
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
