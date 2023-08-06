package DesignPattern.AdapterFactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("The shape is Square");
    }
}
