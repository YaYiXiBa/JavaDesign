package com.xp.javadesign.brige;

public class Client {
    public static void main(String[] args) {
        AmericanCoffee americanCoffee = new AmericanCoffee(new Milk());
        americanCoffee.makeCoffee();

        Cappuccino cappuccino = new Cappuccino(new Sugar());
        cappuccino.makeCoffee();

    }
}
