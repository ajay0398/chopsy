package com.gtech.chopsy.controller;


import com.gtech.chopsy.model.User;
import com.gtech.chopsy.repository.UserRepository;
import com.gtech.chopsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;


    @GetMapping()
    public List<User> getAllUser(){
        //return UserRoster.getAllUser();
        return service.getAllUser();

    }

    @PostMapping()
    public User save(@RequestBody User user){
        return service.save(user);
    }



}
