package com.example.springsecurityexample.security.util;

public enum Role {

    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER");

    private String role;

    Role(String role) {
        this.role=role;
    }

    public String getRole(String role)
    {
        if (role.equalsIgnoreCase("Admin")){
            return ADMIN.role;
        }
        else
            return USER.role;

    }

}
