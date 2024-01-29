package com.tony.structure.flyweight.abs.impl;

import com.tony.structure.flyweight.abs.Shape;

public class Circle implements Shape {
    private int x;
    private int y;
    private int radius;
    private String color;


    @Override
    public void draw() {
        System.out.println(this);
    }

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
