package com.tony.create.prototype.product.impl;

import com.tony.create.prototype.product.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "三角形";
    }

    @Override
    public void draw() {
        System.out.println("画了一个三角形");
    }
}
