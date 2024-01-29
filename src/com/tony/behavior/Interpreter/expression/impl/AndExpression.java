package com.tony.behavior.Interpreter.expression.impl;

import com.tony.behavior.Interpreter.expression.Expression;

import java.util.Objects;

public class AndExpression implements Expression {
    private Expression bExpression;
    private Expression aExpression;

    public AndExpression(Expression bExpression, Expression aExpression) {
        this.bExpression = bExpression;
        this.aExpression = aExpression;
    }

    @Override
    public boolean interpreter(String context) {
        return !Objects.isNull(context) && aExpression.interpreter(context) && bExpression.interpreter(context);
    }
}
