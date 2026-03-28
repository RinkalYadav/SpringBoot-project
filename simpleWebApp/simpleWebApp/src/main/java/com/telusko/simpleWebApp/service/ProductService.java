package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = Arrays.asList(new Product(101,"IPhone",50000), new Product(102,"Camera",80000), new Product(103,"Laptop",90000));

    public List<Product> getProducts(){
        return products;
    }
}
