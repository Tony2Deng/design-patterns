package com.tony.behavior.responsibilitychain.logger;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMsg(int level, String message) {
        if (this.level <= level) {
            write(message);
        }else if (nextLogger != null) {
            nextLogger.logMsg(level, message);
        }
    }

    public abstract void write(String message);
}
