package com.example.productcatalog2.repository;

import com.example.productcatalog2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
