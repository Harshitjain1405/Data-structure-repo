package DesignPattern.AbstractFactory;

public class ShapeGet {
    public static AbstractFactory getShapeFactory(boolean round){
        if(round){
            return new RoundedShape();
        } else {
            return new NormalShape();
        }

    }
}
