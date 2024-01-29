package com.tony.behavior.template;

import com.tony.behavior.template.game.AbstractGame;
import com.tony.behavior.template.game.BasketBall;
import com.tony.behavior.template.game.FootBall;

public class TemplateDemo {
    public static void main(String[] args) {
        AbstractGame football = new FootBall();
        football.play();
        AbstractGame basketBall = new BasketBall();
        basketBall.play();
    }
}
