package com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class DiscountNotAvailableV2 extends DiscountV2 {

    public DiscountNotAvailableV2() {
        super(null);
    }

    @Override
    public boolean validateRule(invoiceItems invoiceItems) {
        return true;
    }

    @Override
    public BigDecimal calculation(invoiceItems invoiceItems) {
        return BigDecimal.ZERO;
    }
}
