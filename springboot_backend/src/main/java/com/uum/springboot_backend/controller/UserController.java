package com.uum.springboot_backend.controller;
import com.uum.springboot_backend.model.User;
import com.uum.springboot_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAll() { return service.listAll(); }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) { return service.get(id); }

    @PostMapping
    public User create(@RequestBody User user) { return service.save(user); }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return service.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
