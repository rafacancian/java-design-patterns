package com.designpatterns.adapter;

public class ManagerClient {

    public ManagerClient() {
    }

    public void execute(final Client client) {
        System.out.println("Manager client execute method");
        client.registerOrder();
        client.getSocialName();
        client.getAddress();
        client.getPhoneNumber();
    }
}
