package com.tony.behavior.strategy.strategy.impl;

import com.tony.behavior.strategy.strategy.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
