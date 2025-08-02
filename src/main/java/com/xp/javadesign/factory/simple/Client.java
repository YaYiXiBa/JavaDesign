package com.xp.javadesign.factory.simple;

public class Client {
    public static void main(String[] args) {
        Shape square = SimpleFactory.getShape("Square");
        assert square != null;
        square.draw();
    }
}
