import java.time.Year;

public class main {

    public static void main(String[] args) {
        Car car = new Car("Dodge", Year.of(1999));

        car.showInfo();
        car.start();
    }
}
