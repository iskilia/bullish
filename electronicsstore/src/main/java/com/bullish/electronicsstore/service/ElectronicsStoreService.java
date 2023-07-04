package com.bullish.electronicsstore.service;

import com.bullish.electronicsstore.model.Product;

public interface ElectronicsStoreService {
    Product createProduct(String productName);
    void removeProduct(UUID productID);
}