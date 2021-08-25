package com.example.springsecurityexample.department.model;

import com.example.springsecurityexample.product.model.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long catId;
    private String catName;
    private String catDescription;
    @OneToMany(mappedBy = "catId")
    private List<Product> products;
}
