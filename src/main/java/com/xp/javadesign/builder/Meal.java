package com.xp.javadesign.builder;

import java.util.ArrayList;

public class Meal {
    private  final ArrayList<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        return (float) items.stream().mapToDouble(Item::price).sum();
    }

    public void show(){
        items.forEach(e->{
            System.out.println("-----------------");
            System.out.println(e.name());
            System.out.println(e.packing().packing());
            System.out.println(e.price());
        });
    }
}
