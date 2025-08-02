package com.xp.javadesign.factory.methed;

public class PCFactory implements Factory{
    @Override
    public Product createProduct() {
        return new PersonalComputer();
    }
}
