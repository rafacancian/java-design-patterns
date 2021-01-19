package com.designpatterns.visitors;

public interface OrderVisitor {

    public void visit(OrderPF pedido);

    public void visit(OrderExport pedido);

    public void visit(OrderSimpleShipping pedido);

}
