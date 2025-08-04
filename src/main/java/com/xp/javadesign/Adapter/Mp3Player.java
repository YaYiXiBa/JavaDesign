package com.xp.javadesign.Adapter;

import java.io.File;

public class Mp3Player implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String file) {
        if(type.equals("mp3") && file.endsWith(".mp3")){
            System.out.println("Playing mp3: "+file);
        } else if (type.equals("mp4") || type.equals("vlc")) {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type, file);
        } else{
            System.out.println("Not supported");
        }
    }
}
