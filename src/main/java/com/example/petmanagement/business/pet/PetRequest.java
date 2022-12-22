package com.example.petmanagement.business.pet;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.petmanagement.domain.pet.Pet} entity
 */
@Data
public class PetRequest implements Serializable {
    private Integer userId;
    private Integer petColorId;
    private Integer petTypeId;
    private Integer petCountryId;
    @Size(max = 255)
    @NotNull
    private String name;
    @NotNull
    private Long code;
}