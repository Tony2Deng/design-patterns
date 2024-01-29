package com.tony.structure.bridge;

import com.tony.structure.bridge.abs.Shape;
import com.tony.structure.bridge.abs.sub.Circle;
import com.tony.structure.bridge.imp.impl.GreenCircle;
import com.tony.structure.bridge.imp.impl.RedCircle;

public class BridgeDemo {
    public static void main(String[] args) {
        Shape red = new Circle(new RedCircle(), 1, 1,2);
        Shape green = new Circle(new GreenCircle(), 1 ,2,3);
        red.draw();
        green.draw();
    }
}
