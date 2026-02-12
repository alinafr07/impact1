package com.impact.lessons.database;
import com.impact.lessons.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserStore {
    private final Map<Long, User> users = new ConcurrentHashMap<>();
    private final AtomicInteger idGenerator = new AtomicInteger(1);
    public List<User> findAll(){
        return new ArrayList<>(users.values());
    }

    public User save(User user){
        long id = idGenerator.getAndIncrement();
        user.setId(id);
        users.put(id, user);
        return user;
    }
    public Optional<User> findById(long id){ 
        return Optional.ofNullable(users.get(id)); 
    }
}
