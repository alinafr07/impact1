package com.impact.lessons.controllers;

import com.impact.lessons.models.User;
import com.impact.lessons.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserService userService = new UserService();

    @PostMapping("/users/create")
    public User createUser(@RequestBody User user){
        return userService.CreateUser(user);
    }
    @GetMapping("/users/get_by_id")    //users/get_by_id
    public Optional<User> GetUserByID(@RequestParam Long id){   //public Optional<User> GetUserByID(@RequestParam Long id)
        return userService.GetUserById(id); // .GetUserById(id)
    }
}
