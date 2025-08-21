package com.xp.javadesign.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class LeafClass implements Component {

    private String name;

    private Integer price;

    public LeafClass(String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public Integer execute() {
        System.out.println("Leaf " + name + " is price " + price);
        return price;
    }
}
