package com.xp.javadesign.brige;

public class AmericanCoffee extends BaseCoffee{
    public AmericanCoffee(CoffeeAdditive additive) {
        super(additive);
    }

    @Override
    public void makeCoffee() {
        System.out.println("美式咖啡" + this.additive.add());
    }
}
