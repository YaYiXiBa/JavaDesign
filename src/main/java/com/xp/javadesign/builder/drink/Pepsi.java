package com.xp.javadesign.builder.drink;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 5f;
    }
}
