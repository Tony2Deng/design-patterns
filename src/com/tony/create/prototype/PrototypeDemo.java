package com.tony.create.prototype;

import com.tony.create.prototype.product.Shape;
import com.tony.create.prototype.shapecache.ShapeCache;

public class PrototypeDemo {
    public static void main(String[] args) {
        Shape cache = ShapeCache.getCache("1");
        cache.draw();
        Shape cache1 = ShapeCache.getCache("3");
        System.out.println(cache1.getType());
    }
}
