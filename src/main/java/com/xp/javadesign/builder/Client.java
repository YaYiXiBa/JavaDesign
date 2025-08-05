package com.xp.javadesign.builder;

import com.xp.javadesign.builder.burger.VegBurger;

public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegAndCoke = mealBuilder.VegAndCoke();
        vegAndCoke.show();
        vegAndCoke.getCost();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        Meal checkAndPepsi = mealBuilder.CheckAndPepsi();
        checkAndPepsi.show();
        checkAndPepsi.getCost();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        checkAndPepsi.addItem(new VegBurger());
        checkAndPepsi.show();
        checkAndPepsi.getCost();
    }
}
