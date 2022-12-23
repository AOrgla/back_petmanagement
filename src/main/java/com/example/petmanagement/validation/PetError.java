package com.example.petmanagement.validation;

import lombok.Getter;

@Getter
public enum PetError {

    INCORRECT_CREDENTIALS("Sellist kasutajanime või parooli ei leitud", "001"),
    USERNAME_EXISTS("Selle nimega kasutaja on juba registreeritud, palun vali uus kasutajanimi.", "002"),
    EMAIL_EXISTS("See meiliaadress on juba kasutusel.", "003");

    private final String message;
    private final String errorCode;

    PetError(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

}
