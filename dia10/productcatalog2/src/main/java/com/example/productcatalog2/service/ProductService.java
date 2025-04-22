package com.example.productcatalog2.service;

import com.example.productcatalog2.model.Product;
import com.example.productcatalog2.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    //CREATE
    public Product saveProduct(Product product) {
       return repository.save(product);
    }

    //READ
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    //READ ONE        optional porq puede existir o no
    public Product getProductById(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found " + id));
    }

    //UPDATE
    public Product updateProduct(int id, Product updatedProduct) {
        Product existing = getProductById(id);
        existing.setId(updatedProduct.getId());
        existing.setName(updatedProduct.getName());
        existing.setPrice(updatedProduct.getPrice());
        return repository.save(existing);
    }

    //DELETE
    public void deleteProduct(int id){
        if (!repository.existsById(id)) {
            throw new RuntimeException("Product not found: " + id);
        }
        repository.deleteById(id);
    }
}