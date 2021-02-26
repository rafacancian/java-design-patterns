package com.designpatterns.facade;

import java.math.BigDecimal;

public class ExecuteFacade {

    public static void execute() {
        BankAccount origin = new BankAccount("Rafael Cancian");
        origin.apply(new BigDecimal("1000"));

        BankAccount destination = new BankAccount("XP Investment");
        destination.apply(new BigDecimal("3000"));

        System.out.println("Customer " + origin.getName() + " has R$" + origin.getAmount());
        System.out.println("Customer " + destination.getName() + " has R$" + destination.getAmount());

        Transfer.execute(origin, destination, new BigDecimal("500"));

        System.out.println("Customer " + origin.getName() + " has R$" + origin.getAmount());
        System.out.println("Customer " + destination.getName() + " has R$" + destination.getAmount());
    }
}
