package com.tony.behavior.command.order.impl;

import com.tony.behavior.command.order.Order;
import com.tony.behavior.command.stock.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}
