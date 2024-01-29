package com.tony.structure.bridge.abs;

import com.tony.structure.bridge.imp.DrawApi;

public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
