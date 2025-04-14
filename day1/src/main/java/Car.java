import java.time.Year;

public class Car extends Vehicle{

    public Car(String brand, Year year) {
        super(brand, year);
    }

    void showInfo(){
        System.out.println("This vehicle its a " + brand + "from "+ year);
    }

    @Override
    void start() {
        System.out.println("\n k-k kkk brummm");
    }
}
