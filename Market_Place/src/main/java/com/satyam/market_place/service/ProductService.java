package com.satyam.market_place.service;

import com.satyam.market_place.model.Product;
import com.satyam.market_place.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product(0,"Sorry We are not able to find it",0,0));
    }

    public void addProduct(Product product) {
        productRepo.save(product);
    }


    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }






















































































































































































}
