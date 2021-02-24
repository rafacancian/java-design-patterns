package com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class CalculateDiscountV2 {

    public BigDecimal execute(invoiceItems invoiceItems) {

        DiscountForItemQuantityV2 discountForItemQuantityV2 = new DiscountForItemQuantityV2(
                new DiscountForTotalValueV2(new DiscountNotAvailableV2()));

        return discountForItemQuantityV2.validateCalculation(invoiceItems);
    }
}
