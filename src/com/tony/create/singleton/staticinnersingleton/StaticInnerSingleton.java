package com.tony.create.singleton.staticinnersingleton;

public class StaticInnerSingleton {

    private static int count = 1;

    private StaticInnerSingleton(){
        count++;
    }

    private static class SingletonHolder{
        public static StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public int getCount() {
        return count;
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
