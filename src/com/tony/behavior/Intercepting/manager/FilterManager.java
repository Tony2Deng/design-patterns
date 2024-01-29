package com.tony.behavior.Intercepting.manager;

import com.tony.behavior.Intercepting.chain.FilterChain;
import com.tony.behavior.Intercepting.chain.Target;
import com.tony.behavior.Intercepting.chain.filter.Filter;

public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFromFilter(Filter filter) {
        filterChain.addFromFilter(filter);
    }

    public void setToFilter(Filter filter) {
        filterChain.addToFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
