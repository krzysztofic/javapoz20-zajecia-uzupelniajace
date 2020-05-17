package com.sda.hexagonal.domain;

import org.junit.Assert;
import org.junit.Test;


public class ProductServiceTest {

    @Test
    public void shouldCreateProduct() {

        //given
        ProductService productService = new ProductService(new FakeProductRepository());
        String name = "product-name";
        String description = "product-description";
        ProductCategory category = ProductCategory.PHONE;
        Double weight = 1.5;

        //when
        Product actualProduct = productService.addProduct(name, description, category, weight);


        //then
        Product expectedProduct = new Product(1L, name, description, category, weight);

        Assert.assertEquals("Product is different", expectedProduct, actualProduct);
    }


    @Test(expected = ProductAlreadyExistsException.class)
    public void shouldThrowProductAlreadyExistExceptionWhileTryingToCreateProductWithSameName(){
        //given

        ProductService productService = new ProductService(new FakeProductRepository());

            String name = "product-1";
            String description = "product-description";
            ProductCategory category = ProductCategory.PHONE;
            Double weight = 1.5;

        //when
        productService.addProduct(name, description, category, weight);
        }

    }
