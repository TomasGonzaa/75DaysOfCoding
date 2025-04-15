package ClaseGenerica.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("001", "Mesa Estilo Escandinavo");

        Pair pair = new Pair<>("Tomás", 25);
        Pair pair2 = new Pair<>("Argentina", "Buenos Aires");
        Pair pair3 = new Pair<>(product.getCodigo(),product.getProductName());

        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(pair3);

    }
}
