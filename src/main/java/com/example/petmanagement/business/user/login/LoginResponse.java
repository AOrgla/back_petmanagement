package com.example.petmanagement.business.user.login;

import com.example.petmanagement.domain.user.User;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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