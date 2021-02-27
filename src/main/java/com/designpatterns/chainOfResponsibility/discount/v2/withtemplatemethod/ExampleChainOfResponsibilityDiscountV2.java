package com.designpatterns.chainOfResponsibility.discount.v2.withtemplatemethod;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class ExampleChainOfResponsibilityDiscountV2 {

    public static void execute() {

        CalculateDiscountV2 calculateDiscountV2 = new CalculateDiscountV2();
        BigDecimal discount = calculateDiscountV2.execute(new invoiceItems(new BigDecimal("300"), 1));
        System.out.println("Discount should be 00,00: " + discount);

        BigDecimal discountQtd = calculateDiscountV2.execute(new invoiceItems(new BigDecimal("100"), 10));
        System.out.println("Discount should be 10,00: " + discountQtd);

        BigDecimal discountValue = calculateDiscountV2.execute(new invoiceItems(new BigDecimal("1000"), 1));
        System.out.println("Discount should be 200,00: " + discountValue);
    }
}
