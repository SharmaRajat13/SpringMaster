package com.example.springsecurityexample.security.controller;

import com.example.springsecurityexample.security.model.User;
import com.example.springsecurityexample.security.service.CustomUserDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final CustomUserDetailsService customUserDetailsService;

    public UserResource(CustomUserDetailsService customUserDetailsService) {
        this.customUserDetailsService = customUserDetailsService;
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(customUserDetailsService.saveUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@RequestParam int id){
        return ResponseEntity.ok(customUserDetailsService.getUser(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(customUserDetailsService.getAllUsers());
    }
}
