package com.tony.behavior.responsibilitychain;

import com.tony.behavior.responsibilitychain.logger.AbstractLogger;
import com.tony.behavior.responsibilitychain.logger.impl.InfoLogger;

public class ResponsibilityChainDemo {
    public static void main(String[] args) {
        AbstractLogger logger = getLogger();
        logger.logMsg(AbstractLogger.INFO, "this is a info");
        logger.logMsg(AbstractLogger.DEBUG, "this is a debug");
        logger.logMsg(AbstractLogger.ERROR, "this is a error");
    }

    public static AbstractLogger getLogger() {
        AbstractLogger info = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debug = new InfoLogger(AbstractLogger.DEBUG);
        AbstractLogger error = new InfoLogger(AbstractLogger.ERROR);

        error.setNextLogger(debug);
        debug.setNextLogger(info);

        return error;
    }
}
