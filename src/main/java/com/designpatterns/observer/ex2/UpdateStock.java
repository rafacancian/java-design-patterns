package com.designpatterns.observer.ex2;

public class UpdateStock implements ExecuteAction {
    @Override
    public void execute(Order order) {
        System.out.println("Update stock removing " + order.getItemsQuantity() + " items");
    }
}
