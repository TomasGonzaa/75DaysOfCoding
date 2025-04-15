package Optional;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductCatalog {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(String name) {
        Product product = new Product(name);
        productList.add(product);
    }

    public Optional<Product> findByProductName(String name){
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.addProduct("helado");
        productCatalog.addProduct("pizza");
        productCatalog.addProduct("hamburguesa");
        productCatalog.addProduct("sanguche");

        productCatalog.findByProductName("pizza");

        productCatalog.findByProductName("pizza").ifPresent(System.out::println);

        String error = "No equalities found";
        productCatalog.findByProductName("burga").ifPresentOrElse(System.out::println,() -> System.out.println("Didnt find any matches"));

    }
}
