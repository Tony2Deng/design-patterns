package com.tony.create.singleton;

import com.tony.create.singleton.EnumSingleton.EnumSingleton;
import com.tony.create.singleton.HungerSongleton.HungerSingleton;
import com.tony.create.singleton.LazySongleton.LazySingleton;
import com.tony.create.singleton.one.SingletonObject;
import com.tony.create.singleton.staticinnersingleton.StaticInnerSingleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject instance = SingletonObject.getInstance();
        System.out.println(instance.getI());
        SingletonObject instance1 = SingletonObject.getInstance();
        System.out.println(instance1.getI());
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance2.getCount());
        LazySingleton instance3 = LazySingleton.getInstance();
        System.out.println(instance3.getCount());
        HungerSingleton instance4 = HungerSingleton.getInstance();
        HungerSingleton.getInstance();
        StaticInnerSingleton instance5 = StaticInnerSingleton.getInstance();
        System.out.println(instance5.getCount());
        System.out.println(EnumSingleton.INSTANCE.getCount());
    }
}
