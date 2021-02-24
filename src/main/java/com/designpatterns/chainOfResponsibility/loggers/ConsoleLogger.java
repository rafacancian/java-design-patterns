package com.designpatterns.chainOfResponsibility.loggers;

public class ConsoleLogger extends AbstractLogger {

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
