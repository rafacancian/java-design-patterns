package com.designpatterns.visitors;

public class OrderExport extends Order {

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
