package com.designpatterns.composite;

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

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
