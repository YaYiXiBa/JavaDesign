package com.xp.javadesign.Flyweight;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Particle> particles;
    public Game() {
        particles = new ArrayList<Particle>();
    }
    public void addParticle(Particle particle){
        this.particles.add(particle);
    }
    public void draw(){
        particles.forEach(
                p->{
                    p.move(LocalTime.now());
                    p.draw();
                    System.out.println();
                }
        );
    }
}
