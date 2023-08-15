package DesignPattern.PrototypePattern;

public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Shape is Rectangle");
    }
}