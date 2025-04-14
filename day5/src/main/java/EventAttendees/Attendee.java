package EventAttendees;

public class Attendee {

    private String name;
    private String id;

    public Attendee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n" +"Attendee's name: "+ name +" - Id: "+ id ;
    }
}
