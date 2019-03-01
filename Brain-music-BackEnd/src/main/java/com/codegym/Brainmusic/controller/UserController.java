package com.codegym.Brainmusic.controller;

import com.codegym.Brainmusic.model.User;
import com.codegym.Brainmusic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/admin/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/register")
    public User createUser (@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}
