package com.designpatterns.intercept;

public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("[Filter request] authentication: " + request);
    }
}
