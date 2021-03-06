package com.designpatterns.chainOfResponsibility.loggers;

public class DebuggerLogger extends AbstractLogger {

    public DebuggerLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUGGER]: " + message);
    }
}
