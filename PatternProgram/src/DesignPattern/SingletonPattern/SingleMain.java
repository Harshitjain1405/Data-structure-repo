package DesignPattern.SingletonPattern;

public class SingleMain {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getSingleObject();

        singleObject.showMessage();
    }
}
