package com.designpatterns.proxy;

import java.math.BigDecimal;

public class ExecuteProxy {

    public static void execute() {


        Item itemA01 = new Item(new BigDecimal(100), "itemA01");
        Order orderA = new Order("0001");
        orderA.addItem(itemA01);
        OrderProxy orderAProxy = new OrderProxy(orderA);

        System.out.println("not add in proxy yet");
        printOrderWithValue(orderA.getCode(), orderAProxy.getValue());
        System.out.println("added in proxy");
        printOrderWithValue(orderA.getCode(), orderAProxy.getValue());
        printOrderWithValue(orderA.getCode(), orderAProxy.getValue());

        System.out.println("---------------");

        Item itemB01 = new Item(new BigDecimal(200), "itemB01");
        Item itemB02 = new Item(new BigDecimal(300), "itemB02");
        Order orderB = new Order("0002");
        orderB.addItem(itemB01);
        orderB.addItem(itemB02);
        orderB.addItem(orderA);
        OrderProxy orderBProxy = new OrderProxy(orderA);

        System.out.println("not add in proxy yet");
        printOrderWithValue(orderB.getCode(), orderBProxy.getValue());
        System.out.println("added in proxy");
        printOrderWithValue(orderB.getCode(), orderBProxy.getValue());
        printOrderWithValue(orderB.getCode(), orderBProxy.getValue());
    }

    private static void printOrderWithValue(String code, BigDecimal value) {
        System.out.println("Order " + code + " R$" + value);
    }
}
