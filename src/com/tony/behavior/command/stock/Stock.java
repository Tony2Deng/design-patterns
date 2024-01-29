package com.tony.behavior.command.stock;

public class Stock {
    private String name = "ABC";

    private int quantity = 10;

    public void buy() {
        System.out.println("buy Stock [ name:" + name + ", quantity:" + quantity + "]");
    }

    public void sell() {
        System.out.println("sell Stock [ name:" + name + ", quantity:" + quantity + "]");
    }
}
