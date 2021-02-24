package com.designpatterns.chainOfResponsibility.discount.v1;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class DiscountForItemQuantity extends Discount {

    public DiscountForItemQuantity(Discount next) {
        super(next);
    }

    public BigDecimal calculate(invoiceItems invoiceItems) {
        if (invoiceItems.getItemsQuantity() > 5) {
            return invoiceItems.getValue().multiply(new BigDecimal("0.1"));
        }
        return next.calculate(invoiceItems);
    }
}
