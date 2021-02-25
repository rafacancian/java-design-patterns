package com.designpatterns.decorator;

import java.math.BigDecimal;

public class ExecuteDecorator {

    public static void execute() {

        Budget budget = Budget.builder().code("0001").value(new BigDecimal("2000")).build();
        CalculateTax calculateTax = new CalculateTax();

        BigDecimal valueWithTaxICMS = calculateTax.calculate(budget, new TaxICMS());
        BigDecimal valueWithTaxISS = calculateTax.calculate(budget, new TaxISS());
        BigDecimal valueWithAllTax = calculateTax.calculate(budget, new TaxICMS(new TaxISS(new TaxPIS())));

        System.out.println("The total value with tax ICMS is R$" + valueWithTaxICMS);
        System.out.println("The total value with tax ISS is R$" + valueWithTaxISS);
        System.out.println("The total value with all tax is R$" + valueWithAllTax);
    }
}
