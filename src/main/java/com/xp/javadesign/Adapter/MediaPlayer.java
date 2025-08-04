package com.xp.javadesign.Adapter;

import java.io.File;

public interface MediaPlayer {
    /**
     * 媒体格式
     * @param type
     *
     * 文件名称
     * @param file
     */
    public void play(String type, String file);
}
