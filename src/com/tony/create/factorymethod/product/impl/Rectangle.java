package com.tony.create.factorymethod.product.impl;

import com.tony.create.factorymethod.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}
