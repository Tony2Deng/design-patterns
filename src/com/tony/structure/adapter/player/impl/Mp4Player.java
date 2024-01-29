package com.tony.structure.adapter.player.impl;

import com.tony.structure.adapter.player.AdvancePlayer;

public class Mp4Player implements AdvancePlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 MP4 文件：" + fileName);
    }
}
