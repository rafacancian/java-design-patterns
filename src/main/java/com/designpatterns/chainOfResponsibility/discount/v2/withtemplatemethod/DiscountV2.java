package com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;


public abstract class DiscountV2 {

    protected DiscountV2 next;

    public DiscountV2(DiscountV2 next) {
        this.next = next;
    }

    abstract boolean validateRule(invoiceItems invoiceItems);

    BigDecimal validateCalculation(invoiceItems invoiceItems) {
        if (validateRule(invoiceItems)) {
            return calculation(invoiceItems);
        }
        return next.validateCalculation(invoiceItems);
    }

    abstract BigDecimal calculation(invoiceItems invoiceItems);

}
