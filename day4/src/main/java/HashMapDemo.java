import java.text.Normalizer;
import java.util.HashMap;

public class HashMapDemo {

    private String name;
    private String number;
    private HashMap<String, String> contacts = new HashMap<>();

    public void addContact(String name,String number){
        contacts.put(normalize(name), number);
    }

    public void showContacts(){
        System.out.println("Contactos: " + contacts.keySet());
    }

    public void searchNumber(String name){
        System.out.println("El nro de "+ normalize(name) + " es " + contacts.get(normalize(name)));
    }

    public void deleteContact(String name){
        contacts.remove(normalize(name));
        System.out.println("Su contacto "+ normalize(name) + " fue eliminado.");
    }

    public String normalize(String input){
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        return normalized.replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+", "").toLowerCase();
    }


    public static void main(String[] args) {
        HashMapDemo hashMapDemo = new HashMapDemo();

        hashMapDemo.addContact("Tomás","381-5489723");
        hashMapDemo.addContact("Marcos","381-5489993");
        hashMapDemo.addContact("Lourdes","381-5489823");

        hashMapDemo.showContacts();

        hashMapDemo.searchNumber("Tomas");

        hashMapDemo.deleteContact("Marcos");

        hashMapDemo.showContacts();
    }
}
