package com.gtech.chopsy.service;

import com.gtech.chopsy.model.User;
import com.gtech.chopsy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<User> getAllUser() {

       List<User> userList= repository.findAll();
        for (User user:userList) {
            user.setDisplayName(user.getFirstName()+" "+user.getLastName());
        }
        return userList;
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }
}
