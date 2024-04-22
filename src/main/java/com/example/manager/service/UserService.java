package com.example.manager.service;

import com.example.manager.model.User;

public interface UserService {
    User findByUsername(String username);
}