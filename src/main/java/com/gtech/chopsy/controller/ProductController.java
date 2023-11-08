package com.gtech.chopsy.controller;

import com.gtech.chopsy.model.Product;
import com.gtech.chopsy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping()
    public ResponseEntity<?> getAllProduct() {
        return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);


    }

    @PostMapping
    ResponseEntity<?> save(@RequestBody Product product) {
        return new ResponseEntity<>(service.save(product), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getProductById(id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    ResponseEntity<?> update(@RequestBody Product product) {
        return new ResponseEntity<>(service.save(product), HttpStatus.OK);
    }


}
