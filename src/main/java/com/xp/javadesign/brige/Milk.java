package com.xp.javadesign.brige;

public class Milk implements CoffeeAdditive{
    @Override
    public String add() {
        return "加奶";
    }
}
