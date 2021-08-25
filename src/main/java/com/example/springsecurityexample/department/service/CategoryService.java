package com.example.springsecurityexample.department.service;

import com.example.springsecurityexample.department.model.Category;
import com.example.springsecurityexample.department.repository.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public Category findByCatName(String catName){
       return categoryRepo.findByCatName(catName).orElseThrow( () -> new EntityNotFoundException("please give correct category name"));
    }
}
