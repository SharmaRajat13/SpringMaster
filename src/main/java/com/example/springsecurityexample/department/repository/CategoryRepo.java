package com.example.springsecurityexample.department.repository;

import com.example.springsecurityexample.department.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

    Optional<Category> findByCatName(String catName);
}
