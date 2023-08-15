package DesignPattern.PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeCache = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeCache.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeCache.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeCache.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeCache.put(rectangle.getId(), rectangle);
    }
}
