package com.designpatterns.intercept;

public class AutorizationFilter implements Filter {
    public void execute(String request) {
        System.out.println("[Filter request] autorization: " + request);
    }
}