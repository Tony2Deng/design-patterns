package com.tony.behavior.Intercepting.chain.filter.impl;

import com.tony.behavior.Intercepting.chain.filter.Filter;

public class ViewFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("View Request:" + request);
    }
}
