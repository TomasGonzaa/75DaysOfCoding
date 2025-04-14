package ReadingClub;

import java.util.*;

public class Administration {
    private List<User> users = new ArrayList<>();
    private Map<User, List<String>> reads = new HashMap<>();

    public User createUser(String name, int id){
        User user = new User(name, id);
        users.add(user);
        return user;
    }

    public void userBooks(User user, String... booksRead){
        if (!users.isEmpty() && users.contains(user)) {
            reads.put(user, List.of(booksRead));
        }else {
            System.out.println("Usuario no encontrado...");
        }
    }

    public void showUsers(){
        if (!users.isEmpty()) {
            System.out.println("\nUsuarios registrados:\n" +users);
        }else{
            System.out.println("Todavía no hay usuarios");
        }
    }

    public void readBooksByUser(User user){
        if (!reads.get(user).isEmpty()) {
            System.out.println(user.toString() + " Books read: " + reads.get(user));
        }else {
            System.out.println("This user did'nt read any book yet...");
        }
    }

    public void allReadBooks(){
//        System.out.println("\nRead Books: \n"+ reads.values());

        HashSet<String> booksread = new HashSet<>();

        for (List<String> books : reads.values()) {
            booksread.addAll(books);
        }
        System.out.println("\nAll read Books: \n"+ booksread);
    }

    public void usersByBook(String book) {
        System.out.println("\nUsers that read "+ book + ":");
        for (User user : reads.keySet()) {
            if (reads.get(user).contains(book)){
                System.out.println(user);
            }
        }
    }

    public static void main(String[] args) {
        Administration administration = new Administration();
        User tomas = administration.createUser("Tomás",42997684);
        User johana = administration.createUser("Johana",23865643);
        User mateo = administration.createUser("Mateo",90874323);
        User marta = administration.createUser("Marta",46338976);

        administration.userBooks(tomas,"Hamlet","Don quijote");
        administration.userBooks(johana,"Casillas","Creer");
        administration.userBooks(mateo,"Hamlet","Posillos");
        administration.userBooks(marta,"Creer","Hamlet");

        System.out.println(administration.reads);

        administration.showUsers();

        administration.readBooksByUser(tomas);

        administration.allReadBooks();

        administration.usersByBook("Creer");
    }
}
