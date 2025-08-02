package com.xp.javadesign.factory.abstractFac.Product;

public class Phone implements Product{
    @Override
    public void showFunction() {
        System.out.println("手机可以打电话");
    }
}
