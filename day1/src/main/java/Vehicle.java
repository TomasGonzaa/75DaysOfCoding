import java.time.Year;

abstract class Vehicle {
    String brand;
    Year year;

    public Vehicle(String brand, Year year){
        this.brand = brand;
        this.year = year;
    }

    abstract void start();

}
