package factoryDesignPattern;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name){
        switch (type){
            case "dog":
                return new Dog(name);
            case "cat":
                return new Cat(name);
            default:
                throw new IllegalArgumentException("Unknown factoryDesignPattern.Animal Type");
        }
    }
}
