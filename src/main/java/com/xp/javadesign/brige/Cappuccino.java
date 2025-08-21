package com.xp.javadesign.brige;

public class Cappuccino extends BaseCoffee{

    public Cappuccino(CoffeeAdditive additive) {
        super(additive);
    }

    @Override
    public void makeCoffee() {
        System.out.println("卡布奇诺" + additive.add());
    }
}
