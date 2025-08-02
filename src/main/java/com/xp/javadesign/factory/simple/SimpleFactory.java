package com.xp.javadesign.factory.simple;

import java.awt.*;

public class SimpleFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Trangle();
        }else{
            return null;
        }
    }
}
