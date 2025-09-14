package com.xp.javadesign.Flyweight;

import java.time.LocalTime;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.addParticle(
                new Particle(LocalTime.now(), "red", 40, 100, "龙腾贴图", new Coords(0.0, 0.0))
        );
        game.draw();
        Thread.sleep(1000);
        game.draw();


    }
}
