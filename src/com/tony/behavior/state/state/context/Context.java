package com.tony.behavior.state.state.context;

import com.tony.behavior.state.state.State;

public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
