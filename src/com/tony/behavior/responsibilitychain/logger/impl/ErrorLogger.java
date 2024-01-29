package com.tony.behavior.responsibilitychain.logger.impl;

import com.tony.behavior.responsibilitychain.logger.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("[ERROR] " + message);
    }
}
