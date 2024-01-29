package com.tony.behavior.mediator.chartroom;

import com.tony.behavior.mediator.user.User;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toInstant() + "[" + user.getName() +  "]: " + message);
    }
}
