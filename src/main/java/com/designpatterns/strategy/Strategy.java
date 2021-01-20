package com.designpatterns.strategy;

public class Strategy {

    public static void execute() {

        StrategyOperation strategyOperation = new OperationSum();
        System.out.println("10 + 5 = " + strategyOperation.doOperation(10, 5));

        strategyOperation = new OperationSubstract();
        System.out.println("10 - 5 = " + strategyOperation.doOperation(10, 5));

        strategyOperation = new OperationMultiply();
        System.out.println("10 * 5 = " + strategyOperation.doOperation(10, 5));

    }
}
