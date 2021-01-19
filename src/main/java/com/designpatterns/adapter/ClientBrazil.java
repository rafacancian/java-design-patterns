package com.designpatterns.adapter;

public class ClientBrazil {

    public void registerOrderBrazil() {
        System.out.println("Register order from Brazil");
    }

    String getSocialNameBrazil() {
        return "social number from Brazil";
    }

    String getAddressBrazil() {
        return "address from Brazil";
    }

    String getPhoneNumberBrazil() {
        return "+51 (19) 99881-5645";
    }
}
