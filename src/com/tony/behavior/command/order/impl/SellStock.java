package com.tony.behavior.command.order.impl;

import com.tony.behavior.command.order.Order;
import com.tony.behavior.command.stock.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.sell();
    }
}
