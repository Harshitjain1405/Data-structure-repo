package DesignPattern.FactoryMethod;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeGet shapeGet = new ShapeGet();
       Shape s1 = shapeGet.getShape("Circle");
       s1.draw();

       Shape s2 = shapeGet.getShape("Rectangle");
       s2.draw();

       Shape s3 = shapeGet.getShape("Square");
       s3.draw();
    }
}
