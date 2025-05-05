package com.example.productcatalog2.controller;

import com.example.productcatalog2.model.Product;
import com.example.productcatalog2.repository.ProductRepository;
import com.example.productcatalog2.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    private final ProductRepository productRepository;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @PostMapping
    public String addProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "Succesfuly added product: " + product.getName();
    }

    @GetMapping
    public String getAllProducts(){
        return "Products List:\n" + productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public String addProduct(@PathVariable int id ,@RequestBody Product updatedProduct){
        productService.updateProduct(id, updatedProduct);
        return "Succesfuly updated product: " + updatedProduct;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "Product removed from the list. \n Current Product List:\n"+ productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public String findProduct(@PathVariable int id) {
        Product foundProduct = productService.getProductById(id);
        return "Product with id "+ id + ": \n"+ foundProduct;
    }


    //Utilizo RequestParam para no utilizar RequestBody ya que los metodos GET no deberían tener body!


    @GetMapping("/search")
    public String findProductByName(@RequestParam String name){
        List<Product> listFound = productRepository.findByName(name);
        if (listFound.isEmpty()) {
           throw new RuntimeException("Product not Found: " + name);
        }
        return listFound.toString();
    }

    @GetMapping("/searchjpql")
    public String searchProductByName(@RequestParam String name){
        List<Product> listFound = productRepository.searchByName(name);
        if (listFound.isEmpty()) {
            throw new RuntimeException("Product not Found: " + name);
        }
        return listFound.toString();
    }

    @GetMapping("/cheaper-than")
    public String searchProductByPriceLowerThan(@RequestParam double price){
        List<Product> listFound = productRepository.searchProductLowerThan(price);
        if (listFound.isEmpty()) {
            throw new RuntimeException("No products found under: "+ price);
        }
        return listFound.toString();
    }




    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String HandleValidationException(IllegalArgumentException exception) {
        return exception.getMessage();
    }
}
