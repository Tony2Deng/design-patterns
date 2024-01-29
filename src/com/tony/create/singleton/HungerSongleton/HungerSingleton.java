package com.tony.create.singleton.HungerSongleton;

public class HungerSingleton {

    private static int count = 1;

    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton(){
        count++;
    }

    public static HungerSingleton getInstance() {
        System.out.println(count);
        return instance;
    }
}
