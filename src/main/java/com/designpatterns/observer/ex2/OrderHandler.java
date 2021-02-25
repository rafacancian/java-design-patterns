package com.designpatterns.observer.ex2;

import java.util.HashSet;
import java.util.Set;

public class OrderHandler {

    Set<ExecuteAction> actions = new HashSet<>();

    public OrderHandler(Set<ExecuteAction> executeActions) {
        actions.addAll(executeActions);
    }

    public void execute(Order order) {
        System.out.println("processing order " + order.getCode());
        actions.forEach(action -> action.execute(order));
        System.out.println("order" + order.getCode() + " processed with success ");
    }
}
