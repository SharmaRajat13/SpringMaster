package com.example.springsecurityexample.security.repository;

import com.example.springsecurityexample.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByMobileNo(String mobileNo);

//    @Query(value = "select u from USER u where u.roles like %1")
//    Optional<User> findByRole(String role);

}
