package com.tony.structure.bridge.imp.impl;

import com.tony.structure.bridge.imp.DrawApi;

public class RedCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("在（" + x + ", " + y + "）上画一个半径为" + radius + "的红圆");
    }
}
