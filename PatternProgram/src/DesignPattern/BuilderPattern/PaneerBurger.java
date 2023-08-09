package DesignPattern.BuilderPattern;

public class PaneerBurger extends Burger{
    @Override
    public String name() {
        return "Paneer Burger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
