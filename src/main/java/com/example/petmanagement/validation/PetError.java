package com.example.petmanagement.validation;

import lombok.Getter;

@Getter
public enum PetError {

    INCORRECT_CREDENTIALS("Username or password does not exist", "001"),
    USERNAME_EXISTS("Selected username is already in use", "002"),
    EMAIL_EXISTS("Mail address is already in use", "003");

    private final String message;
    private final String errorCode;

    PetError(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
