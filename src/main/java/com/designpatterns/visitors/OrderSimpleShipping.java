package com.designpatterns.visitors;

public class OrderSimpleShipping extends Order {

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
