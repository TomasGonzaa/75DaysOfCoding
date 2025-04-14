package WorkshopRegistration;

import java.util.Objects;

public class Person {

    protected String name;


    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // mismo objeto
        if (o == null || getClass() != o.getClass()) return false; // no es WorkshopRegistration.Person
        Person person = (Person) o;
        return name.equalsIgnoreCase(person.name); // compara por nombre
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase()); // consistente con equals
    }
}
