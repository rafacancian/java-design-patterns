package com.designpatterns.facade;

import java.math.BigDecimal;

public class Transfer {

    public static void execute(BankAccount origin, BankAccount destination, BigDecimal value) {

        validateBankAccount(origin);
        validateBankAccount(destination);
        validateBalance(origin, value);
        executeTransferApproved(origin, destination, value);

    }

    private static void executeTransferApproved(BankAccount origin, BankAccount destination, BigDecimal value) {
        origin.subtract(value);
        destination.apply(value);
        System.out.println("Transfer realized with success");
    }

    private static void validateBalance(BankAccount origin, BigDecimal value) {
        System.out.println("Validate balance of customer " + origin.getName());
        if (origin.getAmount().compareTo(value) <= 0) {
            throw new RuntimeException("the customer does not have enough balance. " +
                    "Balance available:" + origin.getAmount() + "| Transfer value:" + value);
        }
    }

    private static void validateBankAccount(BankAccount origin) {
        System.out.println("validate bank account of customer " + origin.getName());
    }
}
