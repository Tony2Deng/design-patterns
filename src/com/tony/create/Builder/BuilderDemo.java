package com.tony.create.Builder;

import com.tony.create.Builder.meal.Meal;
import com.tony.create.Builder.meal.MealBuilder;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareCheckenMeal();
        meal.showItems();
        Meal meal1 = mealBuilder.prepareVegMeal();
        meal1.showItems();
    }
}
