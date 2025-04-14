package EventAttendees;

import java.util.*;

public class Registration {

    private List<Attendee> attendees = new ArrayList<>();

    public void createAttendee(String name, String id){
        Attendee attendee = new Attendee(name, id);
        attendees.add(attendee);
    }

    public void attendees(){
        HashSet<String> attendeesNames = new HashSet<>();
        for (Attendee person : attendees) {
            attendeesNames.add(person.getName());
        }
        System.out.println("\n Todos los inscriptos: " + attendeesNames);
    }

    public void attendesOrder(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (Attendee person : attendees) {
            linkedHashSet.add(person.getName());
        }
        System.out.println("\n Orden Inscripcion: " + linkedHashSet);
    }

    public void orderByName(){
        TreeSet<String> treeSet = new TreeSet<>();
        for (Attendee person : attendees) {
            treeSet.add(person.getName());
        }
        System.out.println("\n Orden Alfabetico: " + treeSet);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.createAttendee("Lucas","48864942");
        registration.createAttendee("Tomás","48839842");
        registration.createAttendee("Joaquin","40845421");
        registration.createAttendee("Anabel","40032422");
        registration.createAttendee("Mabel","43208442");
        registration.createAttendee("Benicio","40584542");

        System.out.println(registration.attendees);

        registration.attendees();
        registration.attendesOrder();
        registration.orderByName();

    }
}
