package DesignPattern.AbstractFactory;

public class ShapeMain {

    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = ShapeGet.getShapeFactory(true);
        Shape s1 = shapeFactory1.getShape("Rectangle");
        s1.draw();

        Shape s2 = shapeFactory1.getShape("Square");
        s2.draw();

        AbstractFactory shapeFactory2 = ShapeGet.getShapeFactory(false);
        Shape s3 = shapeFactory2.getShape("Rectangle");
        s3.draw();

        Shape s4 = shapeFactory2.getShape("Square");
        s4.draw();
    }

}
