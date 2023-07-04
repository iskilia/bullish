package com.bullish.electronicsstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bullish.electronicsstore.dao.ProductDao;
import com.bullish.electronicsstore.model.Product;
import com.bullish.electronicsstore.service.ElectronicStoreService;

@Service
public interface ElectronicsStoreServiceImpl implements ElectronicsStoreService {

    @Autowired
    ProductDao productDao;

    @Override
    public Product createProduct(String productName) {
        return productDao.createProduct(productName);
    }

    @Override
    public void removeProduct(UUID productId) {
        // We should check if the product is present or not
        productDao.removeProduct(productId)
    }
}