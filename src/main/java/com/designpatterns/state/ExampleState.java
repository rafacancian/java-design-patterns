package com.designpatterns.state;

public class ExampleState {

    public static void execute() {

        System.out.println("creating order with success flow");
        Order order = new Order();
        System.out.println("Order created: " + order);
        order.approved();
        System.out.println("Order approved: " + order);
        order.finished();
        System.out.println("Order finished: " + order);

        System.out.println("creating order with error flow");
        Order order2 = new Order();
        System.out.println("Order created: " + order2);
        // Throw StateException: State cannot be change to Finished
        //order2.finished();

    }
}
