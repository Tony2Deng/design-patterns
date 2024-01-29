package com.tony.behavior.Interpreter.expression.impl;

import com.tony.behavior.Interpreter.expression.Expression;

import java.util.Objects;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        return !Objects.isNull(context) && context.contains(data);
    }
}
