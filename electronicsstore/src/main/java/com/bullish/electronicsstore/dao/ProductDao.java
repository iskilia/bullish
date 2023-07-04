package com.bullish.electronicsstore.dao;

import com.bullish.electronicsstore.model.Product;
public interface ProductDao {
    Product createProduct(String productName);
    void removeProduct(UUID productId);
}