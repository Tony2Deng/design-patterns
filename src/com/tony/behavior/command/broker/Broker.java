package com.tony.behavior.command.broker;

import com.tony.behavior.command.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrder() {
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
