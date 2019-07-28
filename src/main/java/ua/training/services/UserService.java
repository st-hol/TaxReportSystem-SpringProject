package ua.training.services;


import ua.training.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User save(User user);

    User findByEmail(String username);
    User registerUser(User user);
}