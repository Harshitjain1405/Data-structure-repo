package DesignPattern.AdapterFactory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("The shape is Rectangle");
    }
}
