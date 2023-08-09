package DesignPattern.BuilderPattern;

public class MealDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegetablemeal = mealBuilder.prepareVegetableMeal();
        System.out.println("Vegetable Meal \n");
         vegetablemeal.showItems();
         System.out.println("Total cost : "+ vegetablemeal.getCost()+"\n");

         Meal paneerMeal = mealBuilder.preparePaneerMeal();
         System.out.println("Paneer Meal \n");
         paneerMeal.showItems();
         System.out.println("Total Cost : "+paneerMeal.getCost()+"\n");
    }
}
