package com.designpatterns.facade;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BankAccount {
    private String name;
    private BigDecimal amount;

    public BankAccount(String name) {
        this.name = name;
        this.amount = BigDecimal.ZERO;
    }

    public void apply(BigDecimal value) {
        setAmount(amount.add(value));
    }

    public void subtract(BigDecimal value) {
        setAmount(amount.subtract(value));
    }
}
