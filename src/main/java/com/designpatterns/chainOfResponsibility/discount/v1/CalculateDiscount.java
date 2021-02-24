package com.designpatterns.chainOfResponsibility.discount.v1;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class CalculateDiscount {

    public BigDecimal execute(invoiceItems invoiceItems) {

        DiscountForItemQuantity discountForItemQuantity = new DiscountForItemQuantity(
                new DiscountForTotalValue(new DiscountNotAvailable()));

        return discountForItemQuantity.calculate(invoiceItems);
    }
}
