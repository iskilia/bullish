package com.bullish.electronicsstore.model

public class Product {
    private UUID productId;
    private String productName;

    public Product(String productName) {
        productId = UUID.randomUUID();
        productName = productName;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}