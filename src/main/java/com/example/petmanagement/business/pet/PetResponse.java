package com.example.petmanagement.business.pet;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.petmanagement.domain.pet.Pet} entity
 */
@Data
public class PetResponse implements Serializable {
    private final Integer id;
    private final Integer userId;
    private final Integer ColorId;
    @Size(max = 255)
    @NotNull
    private final String Color;
    private final Integer TypeId;
    @Size(max = 255)
    @NotNull
    private final String Type;
    private final Integer CountryId;
    @Size(max = 255)
    @NotNull
    private final String Country;
    @Size(max = 255)
    @NotNull
    private final String name;
    @NotNull
    private final Long code;
}