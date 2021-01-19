package com.designpatterns.visitors;

public class OrderDespacher {
    GenerateShippingVisitor generateShippingVisitor = new GenerateShippingVisitor();

    public void despacher(Order order) {
        order.accept(generateShippingVisitor);
    }

}
