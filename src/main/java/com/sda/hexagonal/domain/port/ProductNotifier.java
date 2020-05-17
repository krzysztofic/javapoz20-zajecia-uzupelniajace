package com.sda.hexagonal.domain.port;

public interface ProductNotifier {

    void notifyAboutNewProduct(Long productId);
}
