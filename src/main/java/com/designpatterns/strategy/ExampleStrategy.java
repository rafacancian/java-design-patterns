package com.designpatterns.strategy;

public class ExampleStrategy {

    public static void execute() {

        System.out.println("10 + 5 = " + new OperationSum().doOperation(10, 5));

        System.out.println("10 - 5 = " + new OperationSubstract().doOperation(10, 5));

        System.out.println("10 * 5 = " + new OperationMultiply().doOperation(10, 5));

    }
}
