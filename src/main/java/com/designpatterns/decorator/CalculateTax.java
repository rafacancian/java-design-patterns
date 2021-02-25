package com.designpatterns.decorator;

import java.math.BigDecimal;

public class CalculateTax {
    public BigDecimal calculate(Budget budget, Tax tax) {
        return budget.getValue().add(tax.executeCalculation(budget));
    }

}
