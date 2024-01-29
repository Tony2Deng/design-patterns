package com.tony.behavior.mediator;

import com.tony.behavior.mediator.user.User;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User tony = new User("tony");
        User james = new User("james");

        tony.sendMessage("Hi!james");
        james.sendMessage("Hi!tony,nice to meet you!");
    }
}
