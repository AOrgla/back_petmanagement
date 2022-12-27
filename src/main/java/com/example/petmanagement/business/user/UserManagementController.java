package com.example.petmanagement.business.user;

import com.example.petmanagement.business.user.login.LoginResponse;
import com.example.petmanagement.business.user.register.RegisterRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserManagementController {

    @Resource
    private UserManagementService userManagementService;
    @CrossOrigin
    @GetMapping("/login")
    @Operation(summary = "Login to user account. Username: John, password: 123 for testing, This user has 3 pets default")
    public LoginResponse login(@RequestParam String username, @RequestParam String password) {
        return userManagementService.login(username, password);
    }

    @CrossOrigin
    @PostMapping("/register")
    @Operation(summary = "For user registration")
    public void register(@RequestBody RegisterRequest registerRequest) {
        userManagementService.addUser(registerRequest);
    }

}
