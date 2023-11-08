package com.gtech.chopsy.service;

import com.gtech.chopsy.model.Product;
import com.gtech.chopsy.repository.ProductRepository;
import jakarta.persistence.Cacheable;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = repository.findAll();
        return productList;
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Integer id) {
        return repository.findById(id).get();

    }

    @Override
    public void delete(Integer id) {
       Optional<Product> product = repository.findById(id);
       if(product.isPresent())
        repository.delete(product.get());

    }

    @Override
    public Product update(Product product) {
        if (product.getId()==null)
            return repository.save(product);
        else
           return null;
    }
}
