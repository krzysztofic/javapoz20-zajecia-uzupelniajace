package com.sda.hexagonal.domain.port;

import com.sda.hexagonal.domain.Product;
import com.sda.hexagonal.domain.ProductCategory;

import java.util.List;

public interface ProductRepository {
    Product save (Product product);
    List<Product> findAll();
    List<Product> findByCategory(ProductCategory category);
}
