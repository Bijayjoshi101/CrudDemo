package com.crud.CrudBackend.services;

import com.crud.CrudBackend.entity.User;
import com.crud.CrudBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {

        return userRepository.save(user);
    }

    public User getUserById(Long id) {

        return userRepository.findById(id).orElse(null);

    }

    public User updateUser(User user1) {
        return userRepository.save(user1);
    }

    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    public void deleteUser(User user) {
        userRepository.delete(user);

    }
}
