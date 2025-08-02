package com.xp.javadesign.factory.methed;

public class Client {
    public static void main(String[] args) {
        Factory pcFactory = new PCFactory();
        Product pc = pcFactory.createProduct();
        pc.showFunction();

        PhoneFactory phoneFactory = new PhoneFactory();
        Product phone = phoneFactory.createProduct();
        phone.showFunction();
    }
}
