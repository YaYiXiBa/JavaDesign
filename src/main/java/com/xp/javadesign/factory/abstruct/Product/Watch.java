package com.xp.javadesign.factory.abstruct.Product;

public class Watch implements Product{
    @Override
    public void showFunction() {
        System.out.println("手表可以装*");
    }
}
