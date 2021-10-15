package com.khushi.assignment.product.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class InsertLoanProductDataRequest {
    String productName;
    Double principalAmount;
    Double tenure;
    Double rateOfInterest;
}