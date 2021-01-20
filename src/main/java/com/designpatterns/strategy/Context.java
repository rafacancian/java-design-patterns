package com.designpatterns.strategy;

public class Context {

    StrategyOperation strategyOperation;

    public Context(StrategyOperation strategyOperation) {
        this.strategyOperation = strategyOperation;
    }

    public int executeStrategy(int number1, int number2) {
        return strategyOperation.doOperation(number1, number2);
    }
}
