package com.tony.create.Builder.meal;

import com.tony.create.Builder.item.Item;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> meal = new ArrayList<>();

    public void addItem(Item item) {
        meal.add(item);
    }

    public double getCost(){
        double cost = 0.0;
        for (Item item : meal) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        System.out.println("meal:");
        double cost = 0.0;
        for (Item item : meal) {
            System.out.print("itemName:" + item.name() + "    ");
            System.out.print("itemPacking:" + item.packing().pack() + "    ");
            System.out.println("itemPrice:" + item.price() + "    ");
            cost += item.price();
        }
        System.out.println("totalCost:" + cost);
        System.out.println();
    }
}
