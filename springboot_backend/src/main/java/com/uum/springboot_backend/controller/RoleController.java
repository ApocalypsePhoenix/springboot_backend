package com.uum.springboot_backend.controller;
import com.uum.springboot_backend.model.Role;
import com.uum.springboot_backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService service;

    @GetMapping
    public List<Role> getAll() { return service.listAll(); }

    @GetMapping("/{id}")
    public Role get(@PathVariable Long id) { return service.get(id); }

    @PostMapping
    public Role create(@RequestBody Role role) { return service.save(role); }

    @PutMapping("/{id}")
    public Role update(@PathVariable Long id, @RequestBody Role role) {
        role.setId(id);
        return service.save(role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
