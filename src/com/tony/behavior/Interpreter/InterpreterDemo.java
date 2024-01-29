package com.tony.behavior.Interpreter;

import com.tony.behavior.Interpreter.expression.Expression;
import com.tony.behavior.Interpreter.expression.impl.OrExpression;
import com.tony.behavior.Interpreter.expression.impl.TerminalExpression;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression marryWomen = getMarryWomen();
        Expression men = getMen();
        System.out.println("Tony is Man? " + men.interpreter("Tony"));
        System.out.println("Jack is Man? " + men.interpreter("Jack"));
        System.out.println("Jack is Marry Women? " + marryWomen.interpreter("Jack"));
        System.out.println("Julie is Marry Women? " + marryWomen.interpreter("Julie"));


    }

    public static Expression getMarryWomen() {
        TerminalExpression robert = new TerminalExpression("Julie");
        TerminalExpression tony = new TerminalExpression("Marry");
        return new OrExpression(robert, tony);
    }

    public static Expression getMen() {
        TerminalExpression robert = new TerminalExpression("Robert");
        TerminalExpression tony = new TerminalExpression("Tony");
        return new OrExpression(robert, tony);
    }
}
