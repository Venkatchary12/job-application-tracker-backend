package com.Project.JobApplicationTracker.service;


import com.Project.JobApplicationTracker.entities.User;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> findByEmail(String email);
}
