package com.tony.behavior.state.state.impl;

import com.tony.behavior.state.state.State;
import com.tony.behavior.state.state.context.Context;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("this is in Start State");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
