package com.xp.javadesign.builder.drink;

import com.xp.javadesign.builder.Bottle;
import com.xp.javadesign.builder.Item;
import com.xp.javadesign.builder.Packing;

public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
