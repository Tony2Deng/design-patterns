package com.tony.create.abstractfactory.product.impl;

import com.tony.create.abstractfactory.product.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("填充蓝色");
    }
}
