package com.designpatterns.composite;

import java.math.BigDecimal;

public class ExampleComposite {

    public static void execute() {

        Item itemA01 = new Item(new BigDecimal(100), "itemA01");
        Order orderA = new Order("0001");
        orderA.addItem(itemA01);
        System.out.println("Order " + orderA.getCode() + " R$" + orderA.getValue());

        Item itemB01 = new Item(new BigDecimal(200), "itemB01");
        Item itemB02 = new Item(new BigDecimal(300), "itemB02");
        Order orderB = new Order("0002");

        orderB.addItem(itemB01);
        orderB.addItem(itemB02);
        orderB.addItem(orderA);

        System.out.println("Order " + orderB.getCode() + " R$" + orderB.getValue());
    }
}
