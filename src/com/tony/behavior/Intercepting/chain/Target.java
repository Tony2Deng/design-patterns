package com.tony.behavior.Intercepting.chain;

public class Target {
    public void execute(String request) {
        System.out.println("Execute Request:" + request);
    }
}
