package DesignPattern.AbstractFactory;

public class RoundedShape extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
       if(shapeType == null){
           return null;
       }
       if(shapeType.equalsIgnoreCase("Square")){
           return new RoundedSquare();
       }
       if(shapeType.equalsIgnoreCase("Rectangle")){
           return new RoundedRectangle();
       }
       return null;
    }
}
