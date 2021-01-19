package com.designpatterns.adapter;

public class ClientPortugal implements Client {

    public void registerOrder() {
        System.out.println("Register order from Portugal");
    }

    @Override
    public String getSocialName() {
        return "social number from Portugal";
    }

    @Override
    public String getAddress() {
        return "address from Portugal";
    }

    @Override
    public String getPhoneNumber() {
        return "+351 999111333";
    }
}
