package com.tony.create.abstractfactory.factory;


import com.tony.create.abstractfactory.factory.impl.BlueShapeFactory;
import com.tony.create.abstractfactory.factory.impl.SquareColorFatory;

public class FactoryProduce {
    public static AbstractFactory getFactory(String choice) {
        if ("Blue".equalsIgnoreCase(choice)) {
            return new BlueShapeFactory();
        } else if ("Square".equalsIgnoreCase(choice)) {
            return new SquareColorFatory();
        }
        return null;
    }
}
