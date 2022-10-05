package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    User showUser(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
}
