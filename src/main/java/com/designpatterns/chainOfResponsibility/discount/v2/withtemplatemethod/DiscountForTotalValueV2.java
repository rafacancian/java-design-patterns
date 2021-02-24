package com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class DiscountForTotalValueV2 extends DiscountV2 {

    public DiscountForTotalValueV2(DiscountV2 next) {
        super(next);
    }

    @Override
    public boolean validateRule(invoiceItems invoiceItems) {
        return invoiceItems.getValue().compareTo(new BigDecimal("500")) > 0;
    }

    public BigDecimal calculation(invoiceItems invoiceItems) {
        return invoiceItems.getValue().multiply(new BigDecimal("0.20"));
    }
}
