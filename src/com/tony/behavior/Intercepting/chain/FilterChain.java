package com.tony.behavior.Intercepting.chain;

import com.tony.behavior.Intercepting.chain.filter.Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> fromFilters = new ArrayList<>();

    private List<Filter> toFilters = new ArrayList<>();

    private Target target;

    public void addFromFilter(Filter filter) {
        fromFilters.add(filter);
    }

    public void addToFilter(Filter filter) {
        toFilters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        fromFilters.forEach(filter -> filter.execute(request));
        target.execute(request);
        toFilters.forEach(filter -> filter.execute(request));
    }
}
