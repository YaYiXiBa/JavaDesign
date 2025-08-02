package com.xp.javadesign.factory.methed;

public class PhoneFactory implements Factory{
    @Override
    public Product createProduct() {
        return new Phone();
    }
}
