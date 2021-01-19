package com.designpatterns.visitors;

public abstract class Order {

    private Shipping shipping;

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public abstract void accept(OrderVisitor visitor);


}

