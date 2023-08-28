package com.jpapractice.searchrestapi.service;

import com.jpapractice.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
