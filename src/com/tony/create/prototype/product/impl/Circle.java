package com.tony.create.prototype.product.impl;

import com.tony.create.prototype.product.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "圆";
    }

    @Override
    public void draw() {
        System.out.println("画了一个圆");
    }
}
