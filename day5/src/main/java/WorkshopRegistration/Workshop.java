package WorkshopRegistration;

import java.util.HashSet;

public class Workshop {

    public String workshopName;
    protected HashSet<Person> registeredPeople;

    public Workshop(String workshopName, HashSet registeredPeople) {
        this.workshopName = workshopName;
        this.registeredPeople = new HashSet<Person>();
    }

    public void registration(String... personName){
        for(String name : personName){
        registeredPeople.add(new Person(name));
        }
    }

    public void createWorkshop(String name, String... names) {
        registration(names);
        Workshop workshop = new Workshop(name, registeredPeople);
        System.out.println("New WorkshopRegistration.Workshop saved: "+ workshop.workshopName);
        System.out.println("Registered people: "+ registeredPeople.toString());
    }
}
