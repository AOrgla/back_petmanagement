package com.example.petmanagement.validation;

import lombok.Getter;

@Getter
public enum PetError {

    INCORRECT_CREDENTIALS("Username or password does not exist", "001"),
    USERNAME_EXISTS("Selected username is already in use", "002"),
    EMAIL_EXISTS("Mail address is already in use", "003"),
    EMPTY_FIELDS("One or more required fields are empty", "004"),
    EMAIL_VALIDATION("Incorrect email format", "005"),
    PET_EXISTS("Pet with this code already exists", "006"),
    INVALID_CODE("Minimum length for code is 5 digits", "007");

    private final String message;
    private final String errorCode;

    PetError(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
