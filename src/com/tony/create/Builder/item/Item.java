package com.tony.create.Builder.item;

import com.tony.create.Builder.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    double price();
}
