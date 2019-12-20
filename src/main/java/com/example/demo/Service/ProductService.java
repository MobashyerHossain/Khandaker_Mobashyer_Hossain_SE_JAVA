package com.example.demo.Service;

import com.example.demo.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = new ArrayList<Product>(Arrays.asList(
            new Product(1, "motherboard1", 550.50,  10, 1),
            new Product(2, "motherboard2", 160.50,  10, 1)
    ));

    public List<Product> getAllProducts(){
        return products;
    }
}
