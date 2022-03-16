package com.codegym.validateformdangky.service;


import com.codegym.validateformdangky.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    void save(User user);
    void deleteUserById(Long id);
}
