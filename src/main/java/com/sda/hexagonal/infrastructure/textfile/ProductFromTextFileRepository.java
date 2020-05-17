package com.sda.hexagonal.infrastructure.textfile;

import com.sda.hexagonal.domain.Product;
import com.sda.hexagonal.domain.port.ProductRepository;

import java.util.List;

public class ProductFromTextFileRepository implements ProductRepository {


    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
