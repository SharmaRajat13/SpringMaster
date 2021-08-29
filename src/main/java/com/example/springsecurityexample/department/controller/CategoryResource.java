package com.example.springsecurityexample.department.controller;

import com.example.springsecurityexample.department.model.Category;
import com.example.springsecurityexample.department.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResource {

    private CategoryService categoryService;

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
