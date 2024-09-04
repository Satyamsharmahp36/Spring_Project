package com.satyam.market_place.controller;


import com.satyam.market_place.model.Product;
import com.satyam.market_place.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {
    @Autowired
    ProductService controller;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return controller.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return controller.getProductById(id);
    }

    @PostMapping( "/products")
    public void addProduct(@RequestBody Product product){
        controller.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        controller.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){









    }

}
