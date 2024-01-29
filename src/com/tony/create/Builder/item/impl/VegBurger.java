package com.tony.create.Builder.item.impl;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public double price() {
        return 8.88;
    }
}
