package com.tony.structure.adapter.player.impl;

import com.tony.structure.adapter.player.MediaPlayer;
import com.tony.structure.adapter.player.adapter.MediaAdapter;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if ("MP3".equalsIgnoreCase(audioType)) {
            System.out.println("播放 MP3 文件：" + fileName);
        } else if ("MP4".equalsIgnoreCase(audioType) || "VLC".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("格式 " + audioType + " 不支持");
        }
    }
}
