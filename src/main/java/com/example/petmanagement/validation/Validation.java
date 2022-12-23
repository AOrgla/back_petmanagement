package com.example.petmanagement.validation;

import com.example.petmanagement.domain.user.User;
import com.example.petmanagement.infrastructure.exception.BusinessException;

import java.util.Optional;

public class Validation {

    public static void validateUserCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(PetError.INCORRECT_CREDENTIALS.getMessage(), PetError.INCORRECT_CREDENTIALS.getErrorCode() );
        }
    }

}
