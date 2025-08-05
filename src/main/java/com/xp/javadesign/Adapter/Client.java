package com.xp.javadesign.Adapter;

public class Client extends Mp3Player {
    public static void main(String[] args) {
        Mp3Player mp3Player = new Mp3Player();
//        mp3Player.play("mp3", "《真的爱你》.mp3");

        mp3Player.play("mp4", "《真心英雄》.mp4");
    }
}
