package com.designpatterns.chainOfResponsibility;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("[ERROR]: " + message);
    }
}
