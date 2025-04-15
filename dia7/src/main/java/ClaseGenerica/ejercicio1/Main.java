package ClaseGenerica.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(1);
        Box box2 = new Box("Juan");

        User user = new User("Tomás","492812798");
        Box box3 = new Box(user);

        System.out.println(box.getValue());
        System.out.println(box2.getValue());
        System.out.println(box3.getValue());
    }
}
