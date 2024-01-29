package com.tony.create.abstractfactory.factory.impl;

import com.tony.create.abstractfactory.factory.AbstractFactory;
import com.tony.create.abstractfactory.product.Color;
import com.tony.create.abstractfactory.product.Shape;
import com.tony.create.abstractfactory.product.impl.Blue;
import com.tony.create.abstractfactory.product.impl.Circle;
import com.tony.create.abstractfactory.product.impl.Rectangle;
import com.tony.create.abstractfactory.product.impl.Square;

public class BlueShapeFactory extends AbstractFactory {
    @Override
    public Color createColor(String color) {
        return new Blue();
    }

    @Override
    public Shape cerateShape(String shape) {
        if ("Rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("Square".equalsIgnoreCase(shape)) {
            return new Square();
        } else if ("Circle".equalsIgnoreCase(shape)) {
            return new Circle();
        }
        return null;
    }
}
