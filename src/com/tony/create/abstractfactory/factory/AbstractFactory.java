package com.tony.create.abstractfactory.factory;

import com.tony.create.abstractfactory.product.Color;
import com.tony.create.abstractfactory.product.Shape;

public abstract class AbstractFactory {
    public abstract Color createColor(String color);
    public abstract Shape cerateShape(String shape);
}
