package com.uum.springboot_backend.service;
import com.uum.springboot_backend.model.Role;
import com.uum.springboot_backend.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository repo;

    public List<Role> listAll() { return repo.findAll(); }
    public Role get(Long id) { return repo.findById(id).orElse(null); }
    public Role save(Role role) { return repo.save(role); }
    public void delete(Long id) { repo.deleteById(id); }
}
