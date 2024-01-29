package com.tony.structure.decorator.deco.sub;

import com.tony.structure.decorator.deco.ShapeDecorator;
import com.tony.structure.decorator.pojo.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        this.setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Border Color: Red");
    }
}
