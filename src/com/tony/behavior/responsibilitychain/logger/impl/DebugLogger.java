package com.tony.behavior.responsibilitychain.logger.impl;

import com.tony.behavior.responsibilitychain.logger.AbstractLogger;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
