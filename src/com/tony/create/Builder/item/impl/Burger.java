package com.tony.create.Builder.item.impl;

import com.tony.create.Builder.item.Item;
import com.tony.create.Builder.packing.Packing;
import com.tony.create.Builder.packing.impl.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
