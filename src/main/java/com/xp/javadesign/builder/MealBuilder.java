package com.xp.javadesign.builder;

import com.xp.javadesign.builder.burger.ChickenBurger;
import com.xp.javadesign.builder.burger.VegBurger;
import com.xp.javadesign.builder.drink.Coke;
import com.xp.javadesign.builder.drink.Pepsi;

public class MealBuilder {
    public Meal VegAndCoke (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal CheckAndPepsi (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
