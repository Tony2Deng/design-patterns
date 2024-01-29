package com.tony.structure.adapter.player.impl;

import com.tony.structure.adapter.player.AdvancePlayer;

public class VlcPlayer implements AdvancePlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放 VLC 文件：" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
