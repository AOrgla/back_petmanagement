package com.example.petmanagement.business.pet;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.petmanagement.domain.pet.Pet} entity
 */
@Data
public class PetResponse implements Serializable {
    private final Integer id;
    private final Integer userId;
    private final Integer colorId;
    @Size(max = 255)
    @NotNull
    private final String color;
    private final Integer typeId;
    @Size(max = 255)
    @NotNull
    private final String type;
    private final Integer countryId;
    @Size(max = 255)
    @NotNull
    private final String country;
    @Size(max = 255)
    @NotNull
    private final String name;
    @NotNull
    private final Long code;
}