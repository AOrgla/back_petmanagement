package com.example.petmanagement.business.dropdowninfo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.petmanagement.domain.pet.PetType} entity
 */
@Data
public class PetTypeResponse implements Serializable {
    private final Integer id;
    @Size(max = 255)
    @NotNull
    private final String type;
}