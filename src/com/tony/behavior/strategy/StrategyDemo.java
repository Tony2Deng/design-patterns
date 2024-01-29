package com.tony.behavior.strategy;

import com.tony.behavior.strategy.context.Context;
import com.tony.behavior.strategy.strategy.impl.OperationAdd;
import com.tony.behavior.strategy.strategy.impl.OperationMultiply;
import com.tony.behavior.strategy.strategy.impl.OperationSubs;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(2, 1));

        context = new Context(new OperationSubs());
        System.out.println(context.executeStrategy(2, 1));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(2, 1));
    }
}
