package com.tony.create.Builder.item.impl;

import com.tony.create.Builder.item.Item;
import com.tony.create.Builder.packing.Packing;
import com.tony.create.Builder.packing.impl.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
