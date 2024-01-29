package com.tony.structure.facade.maker;

import com.tony.structure.facade.abs.Shape;
import com.tony.structure.facade.abs.impl.Circle;
import com.tony.structure.facade.abs.impl.Rectangle;
import com.tony.structure.facade.abs.impl.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }
}
