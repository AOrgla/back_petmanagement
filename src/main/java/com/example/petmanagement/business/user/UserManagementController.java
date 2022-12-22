package com.example.petmanagement.business.user;

import com.example.petmanagement.business.user.login.LoginResponse;
import com.example.petmanagement.business.user.register.RegisterRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserManagementController {

    @Resource
    private UserManagementService userManagementService;

    @GetMapping("/login")
    public LoginResponse login(@RequestParam String username, @RequestParam String password) {
        return userManagementService.login(username, password);
    }

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest registerRequest) {
        userManagementService.addUser(registerRequest);
    }

}
