package com.tony.create.abstractfactory.factory.impl;

import com.tony.create.abstractfactory.factory.AbstractFactory;
import com.tony.create.abstractfactory.product.Color;
import com.tony.create.abstractfactory.product.Shape;
import com.tony.create.abstractfactory.product.impl.Blue;
import com.tony.create.abstractfactory.product.impl.Green;
import com.tony.create.abstractfactory.product.impl.Red;
import com.tony.create.abstractfactory.product.impl.Square;

public class SquareColorFatory extends AbstractFactory {
    @Override
    public Color createColor(String color) {
        if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        } else if ("Green".equalsIgnoreCase(color)) {
            return new Green();
        } else if ("Blue".equalsIgnoreCase(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape cerateShape(String shape) {
        return new Square();
    }
}
