package com.xp.javadesign.prototype;

public class Circle extends Shape{

    public Circle(){
         type = "Circle";
    }



    @Override
    void draw() {
        System.out.println("draw Circle");
    }
}
