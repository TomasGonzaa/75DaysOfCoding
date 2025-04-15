package ClaseGenerica.ejercicio2;

public class Product {
    private String codigo;
    private String productName;

    public Product(String codigo, String productName) {
        this.codigo = codigo;
        this.productName = productName;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codigo='" + codigo + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }

    public String getProductName() {
        return productName;


    }
}
