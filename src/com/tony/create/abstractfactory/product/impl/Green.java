package com.tony.create.abstractfactory.product.impl;

import com.tony.create.abstractfactory.product.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
