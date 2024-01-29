package com.tony.structure.adapter.player.adapter;

import com.tony.structure.adapter.player.AdvancePlayer;
import com.tony.structure.adapter.player.MediaPlayer;
import com.tony.structure.adapter.player.impl.Mp4Player;
import com.tony.structure.adapter.player.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancePlayer advancePlayer;

    public MediaAdapter(String audioType) {
        if ("MP4".equalsIgnoreCase(audioType)) {
            this.advancePlayer = new Mp4Player();
        } else if ("VLC".equalsIgnoreCase(audioType)) {
            this.advancePlayer = new VlcPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if ("MP4".equalsIgnoreCase(audioType)) {
            advancePlayer.playMp4(fileName);
        } else if ("VLC".equalsIgnoreCase(audioType)) {
            advancePlayer.playVlc(fileName);
        } else if ("".equalsIgnoreCase(audioType)) {
            System.out.println("播放MP3");
        }
    }
}
