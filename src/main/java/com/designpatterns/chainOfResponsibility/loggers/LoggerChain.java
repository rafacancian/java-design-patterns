package com.designpatterns.chainOfResponsibility.loggers;

public class LoggerChain {

    public static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debuggerLogger = new DebuggerLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debuggerLogger);
        debuggerLogger.setNextLogger(infoLogger);

        return errorLogger;
    }
}
