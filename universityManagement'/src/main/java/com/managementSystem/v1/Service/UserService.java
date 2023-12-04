package com.managementSystem.v1.Service;
import com.managementSystem.v1.Entity.User;
import com.managementSystem.v1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUserById(Long userId) {
        return userRepo.findById(userId).orElse(null);
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(Long userId, User updatedUser) {
        User existingUser = userRepo.findById(userId).orElse(null);
        if (existingUser != null) {
            // Update fields based on your requirements
            existingUser.setFirstName(updatedUser.getFirstName());
            existingUser.setSurname(updatedUser.getSurname());
            // Update other fields

            userRepo.save(existingUser);
        }
        return existingUser;
    }

    public void deleteUser(Long userId) {
        userRepo.deleteById(userId);
    }
}

