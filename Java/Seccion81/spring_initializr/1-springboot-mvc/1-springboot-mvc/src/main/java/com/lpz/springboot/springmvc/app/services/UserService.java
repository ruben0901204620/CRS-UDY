package com.lpz.springboot.springmvc.app.services;

import com.lpz.springboot.springmvc.app.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> finAll();
    Optional<User> findById(Long id);
    User save(User user);
    void remote(Long id);

}
