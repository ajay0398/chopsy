package com.gtech.chopsy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/health/")
public class HealthCheckController {
    @GetMapping("check")
    public ResponseEntity<?> healthCheck(){
        return new ResponseEntity<>("Up", HttpStatus.OK);
    }
    @GetMapping("/greeting")
    public ResponseEntity<?> greeting(){
        return new ResponseEntity<>("Welcome to CHOPSY, soon you will get your order 🍔", HttpStatus.OK);
    }

    @GetMapping ("/date")
    public ResponseEntity<?> currentDate(){
        return new ResponseEntity<>(new Date().toString(),HttpStatus.OK);
    }
}
