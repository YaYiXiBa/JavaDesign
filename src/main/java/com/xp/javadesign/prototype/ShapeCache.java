package com.xp.javadesign.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeCache = new Hashtable<>();
    public static Shape getShape(String shapeId) {
        Shape shape = shapeCache.get(shapeId);
        try {
            return (Shape) shape.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void load() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeCache.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeCache.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeCache.put(rectangle.getId(),rectangle);
    }
}
