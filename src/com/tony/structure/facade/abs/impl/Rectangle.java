package com.tony.structure.facade.abs.impl;

import com.tony.structure.facade.abs.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个三角形");
    }
}
