package com.tony.structure.decorator;

import com.tony.structure.decorator.deco.sub.RedShapeDecorator;
import com.tony.structure.decorator.pojo.impl.Circle;
import com.tony.structure.decorator.pojo.impl.Rectangle;

public class DecoratorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        Rectangle rectangle = new Rectangle();
        RedShapeDecorator redShapeDecorator1 = new RedShapeDecorator(rectangle);
        circle.draw();
        redShapeDecorator.draw();
        System.out.println(">>>>>>");
        rectangle.draw();
        redShapeDecorator1.draw();
    }
}
