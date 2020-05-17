package com.sda.hexagonal.domain;

import com.sda.hexagonal.domain.port.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;


public class ProductServiceTest {

    @Test
    public void shouldCreateProduct() {

        //given
        String name = "product-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight = 1.5;

        ProductRepository productRepositoryMock = Mockito.mock(ProductRepository.class);
        Mockito.when(productRepositoryMock.findByCategory(ProductCategory.PHONE))
                .then(e -> Arrays.asList(
                        new Product(1L, "product-1", "product-description-1", ProductCategory.PHONE, 1.5),
                        new Product(2L, "product-3", "product-description-3", ProductCategory.PHONE, 1.2),
                        new Product(3L, "product-8", "product-description-8", ProductCategory.PHONE, 1.8),
                        new Product(4L, "product-15", "product-description-15", ProductCategory.PHONE, 2.5)
                ));

        Mockito.when(productRepositoryMock.save(Mockito.any()))
                .then(e -> new Product(1L, name, description, category, weight));

        ProductService productService = new ProductService(productRepositoryMock);


        //when
        Product actualProduct = productService.addProduct(name, description, category, weight);


        //then
        Product expectedProduct = new Product(1L, name, description, category, weight);

        Assert.assertEquals("Product is different", expectedProduct, actualProduct);
    }


    @Test(expected = ProductAlreadyExistsException.class)
    public void shouldThrowProductAlreadyExistsExceptionWhileTryingToCreateProductWithSameName() {
        // given
        ProductRepository productRepositoryMock = Mockito.mock(ProductRepository.class);
        Mockito.when(productRepositoryMock.findByCategory(Mockito.any()))
                .then(e -> Arrays.asList(new Product(1L, "duplicated-name", null, null, null)));

        ProductService productService = new ProductService(productRepositoryMock);

        String name = "duplicated-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight = 1.5;

        // when
        productService.addProduct(name, description, category, weight);
    }
}