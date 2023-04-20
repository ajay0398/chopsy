package com.gtech.chopsy.controller;


import com.gtech.chopsy.model.User;
import com.gtech.chopsy.repository.UserRepository;
import com.gtech.chopsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService service;


    @GetMapping()
    public ResponseEntity<?> getAllUser(){

        return new ResponseEntity(service.getAllUser(), HttpStatus.OK);

    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody User user){
        return new ResponseEntity<>(service.save(user), HttpStatus.CREATED) ;
    }



}
