package com.designpatterns.proxy;

import java.math.BigDecimal;

public class OrderProxy implements OrderCommon {

    private Order order;
    private BigDecimal amount;

    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public BigDecimal getValue() {
        if (amount == null) {
            amount = order.getValue();
        }
        return amount;
    }
}

