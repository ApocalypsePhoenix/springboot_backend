package com.uum.springboot_backend.repository;
import com.uum.springboot_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
