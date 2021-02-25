package com.designpatterns.decorator;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public abstract class Tax {

    Tax nextTax;

    public Tax(Tax nextTax) {
        this.nextTax = nextTax;
    }

    protected BigDecimal executeCalculation(Budget budget) {
        BigDecimal taxValue = calculate(budget);
        BigDecimal taxNextValue = BigDecimal.ZERO;
        if (nextTax != null) {
            taxNextValue = nextTax.executeCalculation(budget);
        }
        return taxValue.add(taxNextValue);
    }

    public abstract BigDecimal calculate(Budget budget);
}
