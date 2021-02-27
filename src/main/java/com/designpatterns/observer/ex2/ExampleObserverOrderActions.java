package com.designpatterns.observer.ex2;

import java.math.BigDecimal;
import java.util.Set;

public class ExampleObserverOrderActions {

    public static void execute() {

        Order order = new Order("00001", 5, new BigDecimal("1000"), "rafael");
        OrderHandler orderHandler = new OrderHandler(Set.of(new SaveOrder(), new SendEmail(), new UpdateStock()));
        orderHandler.execute(order);
    }
}
