package ReadingClub;

public class User {
    private String name;
    private int id;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n"+ name + " (id: " + id + ")";
    }
}
