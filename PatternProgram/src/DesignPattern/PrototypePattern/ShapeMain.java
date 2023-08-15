package DesignPattern.PrototypePattern;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getId()+ " : "+clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println(clonedShape2.getId()+ " : "+clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println(clonedShape3.getId()+ " : "+clonedShape3.getType());
    }
}
