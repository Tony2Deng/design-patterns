package com.tony.create.factorymethod.product.impl;

import com.tony.create.factorymethod.product.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画了一个长方形");
    }
}
