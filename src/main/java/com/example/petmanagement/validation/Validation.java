package com.example.petmanagement.validation;

import com.example.petmanagement.domain.contact.Contact;
import com.example.petmanagement.domain.pet.Pet;
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
        boolean isCorrect = false;
        if (contact.getEmail().contains("@") == isCorrect) {
            throw new BusinessException(PetError.EMAIL_VALIDATION.getMessage(), PetError.EMAIL_VALIDATION.getErrorCode());
        } else {
            for (Contact allContact : allContacts) {
                if (allContact.getEmail().equals(contact.getEmail())) {
                    throw new BusinessException(PetError.EMAIL_EXISTS.getMessage(), PetError.USERNAME_EXISTS.getErrorCode());
                }
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

    public static void formValidation(User user) {
        if (user.getUsername().length() == 0 || user.getPassword().length() == 0) {
            throw new BusinessException(PetError.EMPTY_FIELDS.getMessage(), PetError.EMPTY_FIELDS.getErrorCode());
        }
    }

    public static void contactFormValidation(Contact contact) {
        if (contact.getEmail().length() == 0 || contact.getFirstname().length() == 0 ||
                contact.getLastname().length() == 0) {
            throw new BusinessException(PetError.EMPTY_FIELDS.getMessage(), PetError.EMPTY_FIELDS.getErrorCode());
        }
    }

    public static void validateEmailFormat(Contact contact) {
        boolean isCorrect = false;
        if (contact.getEmail().contains("@") == isCorrect) {
            throw new BusinessException(PetError.EMAIL_VALIDATION.getMessage(), PetError.EMAIL_VALIDATION.getErrorCode());
        }
    }

    public static void validatePetExists(Pet pet, List<Pet> allPets) {
        for (Pet singlePet : allPets) {
            if (pet.getCode() == (long) singlePet.getCode()) {
                throw new BusinessException(PetError.PET_EXISTS.getMessage(), PetError.PET_EXISTS.getErrorCode());
            }
        }
    }
}
