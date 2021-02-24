package com.designpatterns.chainOfResponsibility.loggers;

import org.springframework.util.ObjectUtils;

public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    int level;

    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(final int level, final String message) {
        if (this.level <= level) {
            write(message);
        }
        if (!ObjectUtils.isEmpty(nextLogger)) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
