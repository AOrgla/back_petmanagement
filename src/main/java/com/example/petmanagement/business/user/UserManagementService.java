package com.example.petmanagement.business.user;

import com.example.petmanagement.business.user.login.LoginRequest;
import com.example.petmanagement.business.user.login.LoginResponse;
import com.example.petmanagement.business.user.register.RegisterRequest;
import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.domain.contact.ContactMapper;
import com.example.petmanagement.domain.contact.ContactService;
import com.example.petmanagement.domain.user.User;
import com.example.petmanagement.domain.user.UserMapper;
import com.example.petmanagement.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserManagementService {

    @Resource
    private UserService userService;

    @Resource
    private ContactService contactService;
    @Resource
    private UserMapper userMapper;

    @Resource
    private ContactMapper contactMapper;

    public LoginResponse login(LoginRequest loginRequest) {
        User user = userService.getValidUser(loginRequest.getUsername(), loginRequest.getPassword());
        return userMapper.toLoginResponse(user);
    }

    public void addUser(RegisterRequest registerRequest) {

        Contact contact = contactMapper.registerRequestToContact(registerRequest);
        User user = userMapper.registerRequestToUser(registerRequest);
        contact.setUser(user);
        userService.addUser(user, contact);
        contactService.addContact(contact);
    }
}
