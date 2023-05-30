package com.example.demob6.service;

import com.example.demob6.entity.Product;
import com.example.demob6.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> GetAll(){
        return (List<Product>) repo.findAll();

    }
    public Product getProductById(Integer id){
        Optional<Product> optional = repo.findById(id);
        return optional.orElse(null);
    }

    public void add(Product newProduct){
        repo.save(newProduct);
    }
    public void delete(Integer id){
        repo.deleteById(id);
    }


}
