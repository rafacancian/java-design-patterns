package com.designpatterns.decorator;

import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class TaxISS extends Tax {

    TaxISS(Tax nextTax) {
        super(nextTax);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.15"));
    }
}
