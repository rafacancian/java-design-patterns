package com.designpatterns.adapter;

public class ClientAdapter extends ClientBrazil implements Client {
    @Override
    public void registerOrder() {
        registerOrderBrazil();
    }

    @Override
    public String getSocialName() {
        return getSocialNameBrazil();
    }

    @Override
    public String getAddress() {
        return getAddressBrazil();
    }

    @Override
    public String getPhoneNumber() {
        return getPhoneNumberBrazil();
    }
}
