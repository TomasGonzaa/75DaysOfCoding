package com.example.productcatalog2.repository;

import com.example.productcatalog2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //Derived Query
    List<Product> findByName(String name);

    //JPQL
    @Query("SELECT p FROM Product p WHERE p.name = :name")
    List<Product> searchByName(@Param("name") String name);

    //Native Queries
    @Query(value = "SELECT * FROM products WHERE price < ?1", nativeQuery = true)
    List<Product> searchProductLowerThan(double price);
}
