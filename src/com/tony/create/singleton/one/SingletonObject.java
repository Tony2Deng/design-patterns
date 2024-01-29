package com.tony.create.singleton.one;

public class SingletonObject {
    private static int i = 1;

    private SingletonObject(){
        i++;
    }

    private static SingletonObject instance = new SingletonObject();

    public static SingletonObject getInstance() {
        return instance;
    }

    public int getI() {
        return i;
    }
}
