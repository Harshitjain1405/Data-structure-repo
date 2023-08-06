package DesignPattern.AdapterFactory;

public class RoundedRectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("The shape is RoundedRectangle");
    }
}
