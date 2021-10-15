package com.khushi.assignment.product.controller;

import com.khushi.assignment.models.Product;
import com.khushi.assignment.product.request.EmiCalculatorRequest;
import com.khushi.assignment.product.response.EmiCalculatorResponse;
import com.khushi.assignment.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("EMIController")
@RequestMapping(value = "/emi")
public class EMICalc {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/{productId}", method = RequestMethod.POST)
    public EmiCalculatorResponse calculateEmi(@PathVariable String productId, @RequestBody EmiCalculatorRequest request) {
        EmiCalculatorResponse response = new EmiCalculatorResponse();
        Product product = productService.getProductById(productId);
        double emi = product.getPrincipalAmount() * product.getRateOfInterest() * (1 + product.getRateOfInterest()) * product.getTenure() / ((1 + product.getRateOfInterest()) * product.getTenure() - 1);
        response.setEmi(emi);
        return response;
    }
}
