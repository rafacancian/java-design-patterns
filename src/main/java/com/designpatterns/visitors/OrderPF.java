package com.designpatterns.visitors;

public class OrderPF extends Order {

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
