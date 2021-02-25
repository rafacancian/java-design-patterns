package com.designpatterns.observer.ex2;

public class SaveOrder implements ExecuteAction {
    @Override
    public void execute(Order order) {
        System.out.println("Order " + order.getCode() + " with total value R$" + order.getValue() + " saved with success");
    }
}
