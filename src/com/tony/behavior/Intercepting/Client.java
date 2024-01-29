package com.tony.behavior.Intercepting;

import com.tony.behavior.Intercepting.manager.FilterManager;

public class Client {
    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
