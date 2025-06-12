package com.uum.springboot_backend.service;
import com.uum.springboot_backend.model.User;
import com.uum.springboot_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> listAll() { return repo.findAll(); }
    public User get(Long id) { return repo.findById(id).orElse(null); }
    public User save(User user) { return repo.save(user); }
    public void delete(Long id) { repo.deleteById(id); }
}
