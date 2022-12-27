package com.example.petmanagement.domain.user;


import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String username, String password) {
        Optional<User> userOptional = userRepository.findUserBy(username, password);
        Validation.validateUserCredentials(userOptional);
        return userOptional.get();
    }

    public void addUser(User user, Contact contact) {
        List<User> allUsers = userRepository.findAll();
        Validation.formValidation(user);
        Validation.validateEmailFormat(contact);
        Validation.validateUserNameExists(user, allUsers);
        userRepository.save(user);
    }
}
