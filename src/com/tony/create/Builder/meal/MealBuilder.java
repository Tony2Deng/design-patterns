package com.tony.create.Builder.meal;


import com.tony.create.Builder.item.impl.CheckenBurger;
import com.tony.create.Builder.item.impl.Coke;
import com.tony.create.Builder.item.impl.Peisi;
import com.tony.create.Builder.item.impl.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareCheckenMeal(){
        Meal meal = new Meal();
        meal.addItem(new CheckenBurger());
        meal.addItem(new Peisi());
        return meal;
    }
}
