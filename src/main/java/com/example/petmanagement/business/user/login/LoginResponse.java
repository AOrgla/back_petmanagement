package com.example.petmanagement.business.user.login;

import com.example.petmanagement.domain.user.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class LoginResponse implements Serializable {
    private final Integer id;
    @Size(max = 255)
    @NotNull
    private final String username;
}