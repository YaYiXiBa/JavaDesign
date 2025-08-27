package com.xp.javadesign.Flyweight;


import java.time.Duration;
import java.time.LocalTime;

public class Particle {
    private LocalTime timeStart;
    private String color;
    private Integer vector;
    private Integer speed;
    private String sprite;
    private Coords coords;
    public Particle(LocalTime start, String color, Integer vector, Integer speed, String sprite, Coords coords) {
        this.timeStart = start;
        this.color = color;
        this.vector = vector;
        this.speed = speed;
        this.sprite = sprite;
        this.coords = coords;
    }
    public void move(LocalTime time) {
        long elapsedSeconds = Duration.between(timeStart, time).getSeconds();
        double sin = Math.sin(Math.PI * vector / 180);
        double cos = Math.cos(Math.PI * vector / 180);
        this.coords.setX(coords.getX() + cos * this.speed * elapsedSeconds);
        this.coords.setY(coords.getY() + sin * this.speed * elapsedSeconds);
        this.speed = speed - 2;
        System.out.println("Moving particle!!!");
    }
    public void draw(){
        System.out.println("开始时间" + this.timeStart);
        System.out.println("子弹颜色：" + this.color);
        System.out.println("子弹角度：" + this.vector);
        System.out.println("子弹速度:" + this.speed);
        System.out.println("子弹贴图：" + this.sprite);
        System.out.println("子弹坐标:" + this.coords);
    }
}
