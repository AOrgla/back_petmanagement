package com.example.petmanagement.validation;

import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.domain.user.User;
import com.example.petmanagement.infrastructure.exception.BusinessException;

import java.util.List;
import java.util.Optional;

public class Validation {

    public static void validateUserCredentials(Optional<User> userOptional) {
        if (userOptional.isEmpty()) {
            throw new BusinessException(PetError.INCORRECT_CREDENTIALS.getMessage(), PetError.INCORRECT_CREDENTIALS.getErrorCode());
        }
    }

    public static void validateEmailExists(Contact contact, List<Contact> allContacts) {
        for (Contact allContact : allContacts) {
            if (allContact.getEmail().equals(contact.getEmail())) {
                throw new BusinessException(PetError.EMAIL_EXISTS.getMessage(), PetError.USERNAME_EXISTS.getErrorCode());
            }
        }
    }

    public static void validateUserNameExists(User user, List<User> allUsers) {
        for (User allUser : allUsers) {
            if (allUser.getUsername().equalsIgnoreCase(user.getUsername())) {
                throw new BusinessException(PetError.USERNAME_EXISTS.getMessage(), PetError.USERNAME_EXISTS.getErrorCode());
            }
        }
    }
}
