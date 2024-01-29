package com.tony.structure.adapter;

import com.tony.structure.adapter.player.MediaPlayer;
import com.tony.structure.adapter.player.impl.AudioPlayer;

public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();
        player.play("mp3", "beyond the horizon.mp3");
        player.play("mp4", "alone.mp4");
        player.play("vlc", "far far away.vlc");
        player.play("avi", "mind me.avi");
    }
}
