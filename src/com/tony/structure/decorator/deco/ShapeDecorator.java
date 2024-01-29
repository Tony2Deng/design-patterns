package com.tony.structure.decorator.deco;

import com.tony.structure.decorator.pojo.Shape;

public class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
