package com.tony.behavior.state.state;

import com.tony.behavior.state.state.context.Context;

public interface State {
    void doAction(Context context);
    String toString();
}
