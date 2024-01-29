package com.tony.behavior.template.game;

public class BasketBall extends AbstractGame{
    @Override
    public void initGame() {
        System.out.println("init basketball");
    }

    @Override
    public void startGame() {
        System.out.println("start basketball");
    }

    @Override
    public void endGame() {
        System.out.println("end basketball");
    }
}
