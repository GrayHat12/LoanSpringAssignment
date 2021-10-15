package com.khushi.assignment.product.service;

import java.time.LocalDateTime;
import java.util.UUID;

import com.khushi.assignment.models.Product;
import com.khushi.assignment.product.request.InsertLoanProductDataRequest;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    //@Transactional
    public Product update(InsertLoanProductDataRequest updateProduct, String productId, String userId) {
        Product product = new Product();
        product.setProductId(productId);
        product.setUpdatedBy(userId);
        product.setUpdatedOn(LocalDateTime.now());
        // set this product on database here
        return product;
    }

    //@Transactional
    public Product create(InsertLoanProductDataRequest updateProduct, String userId) {
        Product product = new Product();
        UUID uuid = UUID.randomUUID();
        product.setProductId(uuid.toString());
        product.setCreatedBy(userId);
        product.setCreatedOn(LocalDateTime.now());
        // set this product on database here
        return product;
    }

    @Cacheable(value = "product", key = "#productId")
    public Product getProductById(String productId) {
        Product product = new Product();
        // get product based on productId and put to product object
        return product;
    }
}