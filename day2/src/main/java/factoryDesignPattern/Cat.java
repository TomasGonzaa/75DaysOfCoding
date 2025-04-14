package factoryDesignPattern;

public class Cat implements Animal{

    private String name;

    public Cat(String name){
        this.name = name;
    }
    @Override
    public void sound() {
        System.out.println(name + " says: Miau Miau");
    }
}
