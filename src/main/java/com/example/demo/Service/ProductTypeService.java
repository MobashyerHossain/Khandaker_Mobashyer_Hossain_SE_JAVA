package com.example.demo.Service;

import com.example.demo.Model.ProductType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductTypeService {
    List<ProductType> product_types = new ArrayList<ProductType>(Arrays.asList(
            new ProductType(1, "Mother Board"),
            new ProductType(2, "Ram"),
            new ProductType(3, "Graphics Card")
    ));

    public List<ProductType> getAllProductTypes(){
        return product_types;
    }
}
