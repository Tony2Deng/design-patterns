package com.tony.create.prototype.product.impl;

import com.tony.create.prototype.product.Shape;

public class Square extends Shape {

    public Square(){
        type = "长方形";
    }

    @Override
    public void draw() {
        System.out.println();
    }
}
