package com.designpatterns.chainOfResponsibility.discount.v1;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class DiscountForTotalValue extends Discount {

    public DiscountForTotalValue(Discount next) {
        super(next);
    }

    public BigDecimal calculate(invoiceItems invoiceItems) {
        if (invoiceItems.getValue().compareTo(new BigDecimal("500")) > 0) {
            return invoiceItems.getValue().multiply(new BigDecimal("0.20"));
        }
        return next.calculate(invoiceItems);
    }
}
