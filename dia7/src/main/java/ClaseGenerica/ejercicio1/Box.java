package ClaseGenerica.ejercicio1;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Box(T value) {
        this.value = value;
    }
}
