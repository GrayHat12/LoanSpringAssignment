package com.khushi.assignment.models;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    String productId;
    String productName;
    Double principalAmount;
    Double tenure;
    Double rateOfInterest;
    Boolean isActive;
    String createdBy;
    LocalDateTime createdOn;
    String updatedBy;
    LocalDateTime updatedOn;
}
