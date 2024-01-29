package com.tony.create.factorymethod.factory;

import com.tony.create.factorymethod.product.Shape;
import com.tony.create.factorymethod.product.impl.Circle;
import com.tony.create.factorymethod.product.impl.Rectangle;
import com.tony.create.factorymethod.product.impl.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if ("Rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if ("Circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        }else if ("Square".equalsIgnoreCase(shapeType)) {
            return new Square();
        } else {
            return null;
        }
    }
}
