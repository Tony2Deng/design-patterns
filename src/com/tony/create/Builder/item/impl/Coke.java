package com.tony.create.Builder.item.impl;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 6.66;
    }
}
