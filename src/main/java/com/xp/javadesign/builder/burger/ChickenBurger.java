package com.xp.javadesign.builder.burger;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 20f;
    }
}
