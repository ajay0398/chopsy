package com.gtech.chopsy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/")
public class HealthCheckController {
    @GetMapping("check")
    public String healthCheck(){
        return "Up";
    }
    @GetMapping("/greeting")
    public String greeting(){
        return "Welcome to CHOPSY, soon you will get your order 🍔";
    }
}
