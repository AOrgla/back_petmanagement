package com.example.petmanagement.domain.user;


import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.domain.contact.ContactRepository;
import com.example.petmanagement.validation.Validation;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;
    private final ContactRepository contactRepository;

    public UserService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public User getValidUser(String username, String password) {
        Optional<User> userOptional = userRepository.findUserBy(username, password);
        Validation.validateUserCredentials(userOptional);
        return userOptional.get();
    }

    public void addUser(User user, Contact contact) {
        List<User> allUsers = userRepository.findAll();
        List<Contact> allContacts = contactRepository.findAll();
        Validation.formValidation(user);
        Validation.validateEmailFormat(contact);
        Validation.validateEmailExists(contact, allContacts);
        Validation.validateUserNameExists(user, allUsers);
        userRepository.save(user);
    }
}
