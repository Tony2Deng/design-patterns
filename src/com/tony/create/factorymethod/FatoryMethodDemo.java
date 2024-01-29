package com.tony.create.factorymethod;

import com.tony.create.factorymethod.factory.ShapeFactory;
import com.tony.create.factorymethod.product.Shape;

public class FatoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        System.out.println(shapeFactory.getShape("qdd"));
    }
}
