package com.uum.springboot_backend.repository;
import com.uum.springboot_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
