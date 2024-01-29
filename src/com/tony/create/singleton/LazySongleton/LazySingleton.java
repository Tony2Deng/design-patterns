package com.tony.create.singleton.LazySongleton;

public class LazySingleton {

    private static int count = 1;

    private static LazySingleton instance;

    private LazySingleton(){
        count++;
    }

    public static synchronized LazySingleton getInstance(){
        System.out.println("hhhhh" + count);
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    //双重校验锁
    public static LazySingleton getInstance1(){
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public int getCount() {
        return count;
    }
}
