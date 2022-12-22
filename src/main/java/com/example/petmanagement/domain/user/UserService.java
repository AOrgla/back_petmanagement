package com.example.petmanagement.domain.user;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String username, String password) {
        Optional<User> userOptional = userRepository.findUserBy(username, password);
        return userOptional.get();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}
