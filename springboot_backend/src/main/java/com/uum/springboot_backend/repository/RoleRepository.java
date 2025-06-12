package com.uum.springboot_backend.repository;
import com.uum.springboot_backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {}
