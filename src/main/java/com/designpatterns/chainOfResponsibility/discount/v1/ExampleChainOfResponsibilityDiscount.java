package com.designpatterns.chainOfResponsibility.discount.v1;

import com.designpatterns.chainOfResponsibility.discount.invoiceItems;

import java.math.BigDecimal;

public class ExampleChainOfResponsibilityDiscount {

    public static void execute() {

        CalculateDiscount calculateDiscount = new CalculateDiscount();
        BigDecimal discount = calculateDiscount.execute(new invoiceItems(new BigDecimal("300"), 1));
        System.out.println("Discount should be 00,00: " + discount);

        BigDecimal discountQtd = calculateDiscount.execute(new invoiceItems(new BigDecimal("100"), 10));
        System.out.println("Discount should be 10,00: " + discountQtd);

        BigDecimal discountValue = calculateDiscount.execute(new invoiceItems(new BigDecimal("1000"), 1));
        System.out.println("Discount should be 200,00: " + discountValue);
    }
}
