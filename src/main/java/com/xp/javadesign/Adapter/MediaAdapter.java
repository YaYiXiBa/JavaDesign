package com.xp.javadesign.Adapter;

public class MediaAdapter extends Mp4Player implements MediaPlayer {

    private final AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }else if (mediaType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }else{
            throw new IllegalArgumentException("Unsupported Media Type");
        }
    }


    @Override
    public void play(String type, String file) {
        if (type.equals("mp4")) {
            advancedMediaPlayer.playMp4(file);
        } else if (type.equals("vlc")) {
            advancedMediaPlayer.playVlc(file);
        }else{
            System.out.println("Unsupported Media Type");
        }
    }
}
