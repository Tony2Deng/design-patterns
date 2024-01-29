package com.tony.create.abstractfactory;

import com.tony.create.abstractfactory.factory.AbstractFactory;
import com.tony.create.abstractfactory.factory.FactoryProduce;
import com.tony.create.abstractfactory.product.Color;
import com.tony.create.abstractfactory.product.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory blue = FactoryProduce.getFactory("blue");
        Shape circle = blue.cerateShape("circle");
        circle.draw();
        Color color = blue.createColor("");
        color.fill();
        AbstractFactory square = FactoryProduce.getFactory("square");
        Shape shape = square.cerateShape("");
        shape.draw();
        Color red = square.createColor("red");
        red.fill();
    }
}
