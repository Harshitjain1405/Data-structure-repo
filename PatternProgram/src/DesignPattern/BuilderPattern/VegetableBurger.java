package DesignPattern.BuilderPattern;

public class VegetableBurger extends Burger{
    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
