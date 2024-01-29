package com.tony.behavior.command;

import com.tony.behavior.command.broker.Broker;
import com.tony.behavior.command.order.impl.BuyStock;
import com.tony.behavior.command.order.impl.SellStock;
import com.tony.behavior.command.stock.Stock;

public class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();
    }
}
