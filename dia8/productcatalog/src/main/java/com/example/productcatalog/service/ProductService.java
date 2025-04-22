package com.example.productcatalog.service;

import com.example.productcatalog.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        Product product1 = new Product(product.getId(),product.getName().toLowerCase(),product.getPrice());
        validateProduct(product1);
        productList.add(product1);
    }

    public List<Product> getAllProducts(){
        return productList;
    }

    public void validateProduct(Product product){
        if (product.getName().isEmpty() || product.getName() == null) {
            throw new IllegalArgumentException("Product name must not be empty");
        }
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Product price must be 0 or higher");
        }
    }

    public Product updateProduct(int idProduct, Product updatedProduct) {
        validateProduct(updatedProduct);
        for (int i = 0; i <= productList.size() ; i++) {
            Product current = productList.get(i);
            if (current.getId() == idProduct) {
                productList.set(i, updatedProduct);//para el put necesito el INDICE "i" de la lista, NO el "id"
                return updatedProduct;
            }
        }
        throw new RuntimeException("Product with Id: " + idProduct + " not found");
    }

    public void deleteProduct(int id){
        for (int i = 0; i < productList.size(); i++) {
            Product current = productList.get(i);
            if (current.getId() == id) {
                productList.remove(id);
                break;
            }
        }

        /* otra opcion es:
        productList.removeIf(product -> product.getId() == id);
         */
    }


    public Product findProduct(int id){
        for (Product product : productList) {
            if (product.getId() == id){
                return product;
            }
        }
        throw  new RuntimeException("Didnt find that Product");
    }
}