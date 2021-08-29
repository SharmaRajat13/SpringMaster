package com.example.springsecurityexample.security.service;

import com.example.springsecurityexample.security.model.User;
import com.example.springsecurityexample.security.repository.UserRepository;
import com.example.springsecurityexample.security.util.Roles;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if (!user.isEmpty()) {
            System.out.println(user.get().toString());
            return user.get();
        }
        return user.get();
    }

    public Optional<User> saveUser(User user) {

        if (user.getRole().equalsIgnoreCase("admin"))
            user.setRole(Roles.ADMIN.getRole("admin"));
        else
            user.setRole(Roles.USER.getRole("user"));

        String encode = bCryptPasswordEncoder.encode(user.getPlainPassword());
        user.setPassword(encode);
        return Optional.of(userRepository.save(user));
    }

    public List<User> saveAll(List<User> users) {
        users.forEach(user -> {

            if (user.getRole().equalsIgnoreCase("admin"))
                user.setRole(Roles.ADMIN.getRole("admin"));
            else
                user.setRole(Roles.USER.getRole("user"));

            user.setPassword(bCryptPasswordEncoder.encode(user.getPlainPassword()));
        });

        return userRepository.saveAllAndFlush(users);
    }

    public User getUser(long id) {
        return userRepository.getById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

