package com.uum.springboot_backend.controller;
import com.uum.springboot_backend.model.Category;
import com.uum.springboot_backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> getAll() { return service.listAll(); }

    @GetMapping("/{id}")
    public Category get(@PathVariable Long id) { return service.get(id); }

    @PostMapping
    public Category create(@RequestBody Category category) { return service.save(category); }

    @PutMapping("/{id}")
    public Category update(@PathVariable Long id, @RequestBody Category category) {
        category.setId(id);
        return service.save(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
