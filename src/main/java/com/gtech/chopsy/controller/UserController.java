package com.gtech.chopsy.controller;


import com.gtech.chopsy.model.User;
import com.gtech.chopsy.util.UserRoster;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping()
    public List<User> getAllUser(){
        return UserRoster.getAllUser();
    }

}
