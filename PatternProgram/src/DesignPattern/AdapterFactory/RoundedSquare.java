package DesignPattern.AdapterFactory;

public class RoundedSquare implements Shape{
    @Override
    public void draw() {
        System.out.println("The shape is Rounded Square");
    }
}
