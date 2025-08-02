package com.xp.javadesign.factory.abstractFac.Product;

public class PC implements Product{
    @Override
    public void showFunction() {
        System.out.println("电脑可以玩3A");
    }
}
