package com.tony.structure.proxy.abs.impl;

import com.tony.structure.proxy.abs.Image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            this.realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
