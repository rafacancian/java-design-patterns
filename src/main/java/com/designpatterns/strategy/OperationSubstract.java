package com.designpatterns.strategy;

public class OperationSubstract implements StrategyOperation {

    @Override
    public int doOperation(int number1, int number2) {
        return number1 - number2;
    }
}
