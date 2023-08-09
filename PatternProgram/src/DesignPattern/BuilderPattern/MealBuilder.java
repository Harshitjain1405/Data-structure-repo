package DesignPattern.BuilderPattern;

public class MealBuilder {
    public Meal prepareVegetableMeal(){
        Meal meal = new Meal();
        meal.addItems(new VegetableBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal preparePaneerMeal(){
        Meal meal = new Meal();
        meal.addItems(new PaneerBurger());
        meal.addItems(new Pepsi());
        return meal;
    }
}
