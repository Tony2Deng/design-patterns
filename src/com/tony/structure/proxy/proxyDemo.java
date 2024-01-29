package com.tony.structure.proxy;

import com.tony.structure.proxy.abs.Image;
import com.tony.structure.proxy.abs.impl.ProxyImage;

public class proxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println(">>>>>>>>>>>");
        image.display();
    }
}
