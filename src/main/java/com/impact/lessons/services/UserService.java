package com.impact.lessons.services;

import com.impact.lessons.database.UserStore;
import com.impact.lessons.models.User;

import java.util.List;

public class UserService {
    private UserStore store = new UserStore();
    public User CreateUser(User user){
        User newUser = new User(user.getUsername(), user.getEmail(), user.getPassword(), user.getRole());
        return store.save(newUser);

    }
    public List<User> GetAllUsers(){ //Optional<User> GetUserById(Long id)
        return store.findAll(); // .findById(id);
    }
}
