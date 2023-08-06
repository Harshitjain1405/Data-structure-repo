package DesignPattern.AdapterFactory;

public class NormalShape extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
