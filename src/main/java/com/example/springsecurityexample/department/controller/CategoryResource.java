package com.example.springsecurityexample.department.controller;

import com.example.springsecurityexample.department.model.Category;
import com.example.springsecurityexample.department.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping(path = "/getByCatName/{catName}")
    public ResponseEntity<Category> findByCatName(@RequestParam String catName){
        return ResponseEntity.ok(categoryService.findByCatName(catName));
    }
}
