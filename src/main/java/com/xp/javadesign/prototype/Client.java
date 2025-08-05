package com.xp.javadesign.prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.load();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());

        // 客户端可以这样使用
        Shape circle1 = ShapeCache.getShape("1");
        Shape circle2 = ShapeCache.getShape("1");
        System.out.println(circle1 == circle2); // false
    }
}
