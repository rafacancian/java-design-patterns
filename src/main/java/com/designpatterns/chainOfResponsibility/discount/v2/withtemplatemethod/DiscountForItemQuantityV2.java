package com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class DiscountForItemQuantityV2 extends DiscountV2 {

    public DiscountForItemQuantityV2(DiscountV2 next) {
        super(next);
    }

    @Override
    public boolean validateRule(invoiceItems invoiceItems) {
        return invoiceItems.getItemsQuantity() > 5;
    }

    public BigDecimal calculation(invoiceItems invoiceItems) {
        return invoiceItems.getValue().multiply(new BigDecimal("0.1"));
    }
}
