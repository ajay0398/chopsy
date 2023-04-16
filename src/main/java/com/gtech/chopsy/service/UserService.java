package com.gtech.chopsy.service;

import com.gtech.chopsy.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public User save(User user);
}
