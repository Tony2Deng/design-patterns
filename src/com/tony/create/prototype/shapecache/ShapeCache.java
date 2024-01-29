package com.tony.create.prototype.shapecache;

import com.tony.create.prototype.product.Shape;
import com.tony.create.prototype.product.impl.Circle;
import com.tony.create.prototype.product.impl.Rectangle;
import com.tony.create.prototype.product.impl.Square;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> cache = new HashMap<>();

    static {
        Circle circle = new Circle();
        circle.setId("1");
        loadCache(circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        loadCache(rectangle);
        Square square = new Square();
        square.setId("3");
        loadCache(square);
    }

    public static Shape getCache(String id) {
        Shape shape = cache.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache(Shape shape) {
        cache.put(shape.getId(), shape);
    }
}
