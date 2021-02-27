package com.designpatterns.proxy;

import java.math.BigDecimal;

public class Item implements OrderCommon {

    private String description;
    private BigDecimal value;

    public Item(BigDecimal value, String description) {
        this.value = value;
        this.description = description;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
