package com.tony.create.singleton.EnumSingleton;

public enum EnumSingleton {
    INSTANCE();

    private int count = 1;

    EnumSingleton(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
