package com.tony.structure.decorator.pojo.impl;

import com.tony.structure.decorator.pojo.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
