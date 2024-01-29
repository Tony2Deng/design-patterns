package com.tony.structure.flyweight;

import com.tony.structure.flyweight.abs.factory.ShapeFactory;
import com.tony.structure.flyweight.abs.impl.Circle;

public class FlyWeightDemo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[i % 5]);
            circle.setX(i);
            circle.setY(i);
            circle.setRadius(i);
            circle.draw();
        }
    }
}
