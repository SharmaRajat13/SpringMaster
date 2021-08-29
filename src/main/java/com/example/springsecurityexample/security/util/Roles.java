package com.example.springsecurityexample.security.util;

public enum Roles {

    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    private String role;

    Roles(String role) {
        this.role = role;
    }

    public String getRole(String role) {
        return this.role;
    }

}
