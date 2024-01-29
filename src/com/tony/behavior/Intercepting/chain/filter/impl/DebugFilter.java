package com.tony.behavior.Intercepting.chain.filter.impl;

import com.tony.behavior.Intercepting.chain.filter.Filter;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Debug Request:" + request);
    }
}
