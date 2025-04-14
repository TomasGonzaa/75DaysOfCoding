package factoryDesignPattern;

public class Dog implements Animal{

    private String name;

    public Dog(String name){
        this.name = name;
    }


    @Override
    public void sound() {
        System.out.println(name +" says: Woof Woof");
    }
}
