package com.xp.javadesign.combcar;



public class Car extends EleEngine {
    private Color color;
    private Engine engine;
    public Car(Color color, Engine engine) {
        this.color = color;
        this.engine = engine;
    }
    public void move() {
        System.out.println(color.getColor() + engine.getEngin() + "启动");
    }

    public static void main(String[] args) {
        new Car(new RedColor(), new EleEngine()).move();
    }

}
