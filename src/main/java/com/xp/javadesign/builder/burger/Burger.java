package com.xp.javadesign.builder.burger;

import com.xp.javadesign.builder.Item;
import com.xp.javadesign.builder.Packing;
import com.xp.javadesign.builder.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
