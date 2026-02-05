package com.impact.lessons.controllers;

import com.impact.lessons.models.User;
import com.impact.lessons.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService = new UserService();

    @PostMapping("/users/create")
    public User createUser(@RequestBody User user){
        return userService.CreateUser(user);
    }
    @GetMapping("/users/get_all")    //users/get_by_id
    public List<User> GetAllUsers(){   //public Optional<User> GetUserByID(@RequestParam Long id)
        return userService.GetAllUsers(); // .GetUserById(id)
    }
}
