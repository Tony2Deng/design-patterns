package com.tony.structure.flyweight.abs.factory;

import com.tony.structure.flyweight.abs.Shape;
import com.tony.structure.flyweight.abs.impl.Circle;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle shape = (Circle) circleMap.get(color);
        if (shape == null) {
            Circle circle = new Circle( color);
            circleMap.put(color, circle);
            System.out.println("Creat:  " + circle);
            return circle;
        }
        return shape;
    }
}
