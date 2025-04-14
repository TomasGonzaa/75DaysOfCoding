package WorkshopRegistration;

import java.util.HashSet;

public class Main {


//    public void saveWorkshop(String name, HashSet<String> people){
//        WorkshopRegistration.Workshop workshop = new WorkshopRegistration.Workshop(name,people);
//        System.out.println("New WorkshopRegistration.Workshop saved!");
//        System.out.println("WorkshopRegistration.Workshop Name: "+ workshop.workshopName+" Registered People: "+workshop.registeredPeople);
//    }

    public static void main(String[] args) {

    String name=null;
    HashSet<String> people=null;

        Workshop workshop = new Workshop(name, people);

        workshop.createWorkshop("Painting","Tomas","Tamara","Facundo","Nahuel","Tamara","Anabel","Zamira");


    }

}
