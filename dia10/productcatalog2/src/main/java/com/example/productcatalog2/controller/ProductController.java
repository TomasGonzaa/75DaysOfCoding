package com.example.productcatalog2.controller;

import com.example.productcatalog2.model.Product;
import com.example.productcatalog2.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
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

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String HandleValidationException(IllegalArgumentException exception) {
        return exception.getMessage();
    }
}
