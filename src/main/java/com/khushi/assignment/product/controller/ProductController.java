package com.khushi.assignment.product.controller;

import com.khushi.assignment.models.Product;
import com.khushi.assignment.product.request.InsertLoanProductDataRequest;
import com.khushi.assignment.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("ProductController")
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/update/{productId}", method = RequestMethod.POST)
    public Product updateProduct(@PathVariable String productId, @RequestBody InsertLoanProductDataRequest request) {
        return productService.update(request, productId, "userid");
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Product createProduct(@RequestBody InsertLoanProductDataRequest request) {
        return productService.create(request, "userid");
    }
}
