package com.tony.behavior.responsibilitychain.logger.impl;

import com.tony.behavior.responsibilitychain.logger.AbstractLogger;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("[INFO] " + message);
    }
}
