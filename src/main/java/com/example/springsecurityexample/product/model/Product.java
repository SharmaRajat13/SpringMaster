package com.example.springsecurityexample.product.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {

    private long prodId;
    private String prodName;
    private String prodDescription;
    private double prodPrice;
    private String catName;
}
