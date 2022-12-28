package com.example.petmanagement.business.user.register;

import com.example.petmanagement.domain.contact.Contact;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Contact} entity
 */
@Data
public class RegisterRequest implements Serializable {
    @Size(max = 255)
    @NotNull
    private String username;
    @Size(max = 255)
    @NotNull
    private String password;
    @Size(max = 255)
    @NotNull
    private String firstname;
    @Size(max = 255)
    @NotNull
    private String lastname;
    @Size(max = 255)
    @NotNull
    private String email;
}