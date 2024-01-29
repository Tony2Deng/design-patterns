package com.tony.structure.decorator.pojo.impl;

import com.tony.structure.decorator.pojo.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
