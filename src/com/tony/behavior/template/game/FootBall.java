package com.tony.behavior.template.game;

public class FootBall extends AbstractGame{
    @Override
    public void initGame() {
        System.out.println("init football game");
    }

    @Override
    public void startGame() {
        System.out.println("play football game");
    }

    @Override
    public void endGame() {
        System.out.println("end football game");
    }
}
