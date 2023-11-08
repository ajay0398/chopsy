package com.gtech.chopsy.service;

import com.gtech.chopsy.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product>getAllProduct();

    public Product save(Product product);

    public Product getProductById(Integer id);

    public void delete(Integer id);

    public Product update(Product product);



}
