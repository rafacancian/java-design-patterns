package com.designpatterns.chainOfResponsibility.discount.v1;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class DiscountNotAvailable extends Discount {

    public DiscountNotAvailable() {
        super(null);
    }

    @Override
    public BigDecimal calculate(invoiceItems invoiceItems) {
        return BigDecimal.ZERO;
    }
}
