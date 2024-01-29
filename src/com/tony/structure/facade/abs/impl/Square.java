package com.tony.structure.facade.abs.impl;

import com.tony.structure.facade.abs.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
