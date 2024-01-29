package com.tony.behavior.Intercepting;

import com.tony.behavior.Intercepting.chain.Target;
import com.tony.behavior.Intercepting.chain.filter.impl.AuthFilter;
import com.tony.behavior.Intercepting.chain.filter.impl.DebugFilter;
import com.tony.behavior.Intercepting.chain.filter.impl.ViewFilter;
import com.tony.behavior.Intercepting.manager.FilterManager;

public class InterceptingDemo {
    public static void main(String[] args) {
        AuthFilter authFilter = new AuthFilter();
        DebugFilter debugFilter = new DebugFilter();
        ViewFilter viewFilter = new ViewFilter();

        Target target = new Target();

        FilterManager filterManager = new FilterManager(target);
        filterManager.setToFilter(viewFilter);
        filterManager.setFromFilter(debugFilter);
        filterManager.setFromFilter(authFilter);

        Client client = new Client();
        client.setFilterManager(filterManager);

        client.sendRequest("hello world!");
    }
}
