package com.tony.structure.bridge.abs.sub;

import com.tony.structure.bridge.abs.Shape;
import com.tony.structure.bridge.imp.DrawApi;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
