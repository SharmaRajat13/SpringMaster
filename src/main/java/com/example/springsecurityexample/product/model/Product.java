package com.example.springsecurityexample.product.model;

import com.example.springsecurityexample.department.model.Category;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {

    @Id
    private long prodId;
    private String prodName;
    private String prodDescription;
    private double prodPrice;
//    @ManyToOne(optional = false, fetch = FetchType.LAZY)
//    private Category category;
}
