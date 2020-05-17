package com.sda.hexagonal;

import com.sda.hexagonal.domain.ProductService;
import com.sda.hexagonal.infrastructure.textfile.ProductFromTextFileRepository;

public class HexagonalApplication {

    public static void main(String[] args) {


        ProductService productService = new ProductService(new ProductFromTextFileRepository());
        productService.addProduct(null, null, null, null);
    }
}
