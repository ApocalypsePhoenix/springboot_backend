package com.uum.springboot_backend.repository;
import com.uum.springboot_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
