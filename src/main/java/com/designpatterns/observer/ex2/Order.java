package com.designpatterns.observer.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String code;
    private int itemsQuantity;
    private BigDecimal value;
    private String userName;
}
