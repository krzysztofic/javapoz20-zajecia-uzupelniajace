package com.sda.hexagonal.domain;

import com.sda.hexagonal.domain.port.ProductRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FakeProductRepository implements ProductRepository {


    @Override
    public Product save(Product product) {
        return new Product(1L, product.getName(), product.getDescription(), product.getCategory(), product.getWeight() );
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>();
    }

    @Override
    public List<Product> findByCategory(ProductCategory category) {
        return Arrays.asList(
                new Product(1L, "product-1", "product-description-1", category, 1.5),
                new Product(2L, "product-3", "product-description-3", category, 1.2),
                new Product(3L, "product-8", "product-description-8", category, 1.8),
                new Product(4L, "product-15", "product-description-15", category, 2.5)
        );
    }
}
