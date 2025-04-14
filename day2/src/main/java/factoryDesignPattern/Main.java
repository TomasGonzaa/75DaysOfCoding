package factoryDesignPattern;

public class Main {

    public static void main(String[] args) {
        //creation through animal factory -- FACTORY DESIGN PATTERN

        Animal dog = AnimalFactory.createAnimal("dog","Akira");

        Animal cat = AnimalFactory.createAnimal("cat","Maximus");

        dog.sound();
        cat.sound();

    }
}
