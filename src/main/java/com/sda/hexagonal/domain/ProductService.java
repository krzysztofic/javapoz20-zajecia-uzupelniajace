package com.sda.hexagonal.domain;

import com.sda.hexagonal.domain.port.ProductNotifier;
import com.sda.hexagonal.domain.port.ProductRepository;

import java.util.List;


public class ProductService {

    private ProductRepository productRepository;
    private ProductNotifier productNotifier;

    public ProductService(ProductRepository productRepository, ProductNotifier productNotifier) {
        this.productRepository = productRepository;
        this.productNotifier = productNotifier;
    }

    public Product addProduct(String name, String description, ProductCategory category, Double weight){
        List<Product> productFromCategory =  productRepository.findByCategory(category);

        boolean productWithSameNameExistCategory = productFromCategory.stream()
                .filter(product -> product.getName().equals(name))
                .findAny()
                .isPresent();
   //      same effect         .anyMatch(product.getName().equals(name));

            if(productWithSameNameExistCategory){
                throw new ProductAlreadyExistsException("Product with name " + name + "exist in category" + category);
            }
            Product product = productRepository.save(new Product(name, description, category, weight));
            productNotifier.notifyAboutNewProduct(product.getId());
            return product;
    }
}
