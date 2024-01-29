package com.tony.behavior.template.game;

public abstract class AbstractGame {
    public abstract void initGame();

    public abstract void startGame();

    public abstract void endGame();

    public void play() {
        System.out.println("play Game");
        initGame();
        startGame();
        endGame();
    }
}
