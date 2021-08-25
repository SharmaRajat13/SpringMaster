package com.example.springsecurityexample.department.controller;

import com.example.springsecurityexample.department.model.Category;
import com.example.springsecurityexample.department.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping(path = "/getByCatName/{catName}")
    public ResponseEntity<Category> findByCatName(@RequestParam String catName){
        return ResponseEntity.ok(categoryService.findByCatName(catName));
    }

    @PostMapping("/saveCategory")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category){
        return ResponseEntity.ok(categoryService.saveCategory(category));
    }

    @GetMapping(path = "/getByCatId/{id}")
    public ResponseEntity<Category> findByCatName(@RequestParam Long id){
        return ResponseEntity.ok(categoryService.findByCatID(id));
    }
}
