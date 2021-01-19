package com.designpatterns.visitors;

public class GenerateShippingVisitor implements OrderVisitor {

    @Override
    public void visit(OrderPF order) {
        order.setShipping(new ShippingSedex());
    }

    @Override
    public void visit(OrderExport order) {
        order.setShipping(new ShippingFedex());
    }

    @Override
    public void visit(OrderSimpleShipping order) {
        order.setShipping(new ShippingCompany());
    }

    public void visit(Order order) {
        order.setShipping(new Shipping());
    }
}

