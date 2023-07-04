package com.bullish.electronicsstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bullish.electronicsstore.model.Product;
import com.bullish.electronicsstore.service.ProductService;

@RestController
public class ElectronicsStoreController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/create-product", method = RequestMethod.POST)
    public Product createProduct(String productName) {
        return productService.createProduct(productName);
    }

    @RequestMapping(value = "/delete-product", method = RequestMethod.POST)
    public void deleteProduct(@RequestBody UUID productId) {
        productService.removeProduct(productId);
    }
}

