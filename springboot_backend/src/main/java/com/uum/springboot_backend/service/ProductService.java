package com.uum.springboot_backend.service;
import com.uum.springboot_backend.model.Product;
import com.uum.springboot_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> listAll() { return repo.findAll(); }
    public Product get(Long id) { return repo.findById(id).orElse(null); }
    public Product save(Product product) { return repo.save(product); }
    public void delete(Long id) { repo.deleteById(id); }
}
