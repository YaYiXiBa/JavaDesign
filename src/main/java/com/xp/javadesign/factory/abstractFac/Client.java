package com.xp.javadesign.factory.abstractFac;

import com.xp.javadesign.factory.abstractFac.Color.Color;
import com.xp.javadesign.factory.abstractFac.Product.Product;
import com.xp.javadesign.factory.abstractFac.factory.Factory;
import com.xp.javadesign.factory.abstractFac.factory.FactoryProducer;

public class Client {
    public static void main(String[] args) {
        Factory colorFactory = FactoryProducer.getFactory("ColorFactory");
        Factory productFactory = FactoryProducer.getFactory("ProductFactory");
        Color red = colorFactory.getColor("red");
        Product watch = productFactory.getProduct("Watch");
        red.showColor();
        watch.showFunction();

        Color yellow = colorFactory.getColor("yellow");
        Product phone = productFactory.getProduct("Phone");
        yellow.showColor();
        phone.showFunction();
    }
}
