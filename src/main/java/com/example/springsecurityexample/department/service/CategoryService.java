package com.example.springsecurityexample.department.service;

import com.example.springsecurityexample.department.model.Category;
import com.example.springsecurityexample.department.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;

import javax.persistence.EntityNotFoundException;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CategoryService {

    private CategoryRepo categoryRepo;

    public Category findByCatName(String catName){
       return categoryRepo.findByCatName(catName).orElseThrow( () -> new EntityNotFoundException("please give correct category name"));
    }

    public Category saveCategory(Category category){
        return categoryRepo.save(category);
    }

    public Category findByCatID(Long catId){
        return categoryRepo.findById(catId).get();
    }
}
