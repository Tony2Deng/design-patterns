package com.tony.behavior.state;

import com.tony.behavior.state.state.context.Context;
import com.tony.behavior.state.state.impl.StartState;
import com.tony.behavior.state.state.impl.StopState;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
