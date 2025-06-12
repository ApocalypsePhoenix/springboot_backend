package com.uum.springboot_backend.service;
import com.uum.springboot_backend.model.Category;
import com.uum.springboot_backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repo;

    public List<Category> listAll() { return repo.findAll(); }
    public Category get(Long id) { return repo.findById(id).orElse(null); }
    public Category save(Category category) { return repo.save(category); }
    public void delete(Long id) { repo.deleteById(id); }
}
