import java.util.ArrayList;

public class List {

    java.util.List<String> names = new ArrayList<>();
    java.util.List<String> longNames = new ArrayList<>();

    public void addName(String name){
        names.add(name);
    }


    public void removeFiveLetterNames(){
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() > 5){
                names.remove(name);
            }
        }System.out.println(names);
    }

    public static void main(String[] args) {

        List list = new List();
        list.addName("Marcos");
        list.addName("Juan");
        list.addName("Antonio");
        list.addName("Maria");
        list.addName("Tomás");
        list.addName("Victoria");

        System.out.println("\n" + list.names + "\n");

        list.removeFiveLetterNames();


    }
}
