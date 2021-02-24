package com.designpatterns.chainOfResponsibility.loggers;

public class ChainOfResponsibilityLogger {

    public static void execute() {

        AbstractLogger loggerChain = LoggerChain.getChainOfLoggers();
        System.out.println("-----------------------");
        System.out.println("Logger info");
        loggerChain.logMessage(AbstractLogger.INFO, "info message level");
        System.out.println("-----------------------");
        System.out.println("Logger debugger");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug message level");
        System.out.println("-----------------------");
        System.out.println("Logger error");
        loggerChain.logMessage(AbstractLogger.ERROR, "error message level");
    }

}
