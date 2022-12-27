package com.example.petmanagement.domain.pet;

import com.example.petmanagement.business.pet.PetRequest;
import com.example.petmanagement.business.pet.PetResponse;
import com.example.petmanagement.business.pet.PetUpdateRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PetMapper {

    @Mapping(source = "petTypeId", target = "petType.id")
    @Mapping(source = "petColorId", target = "petColor.id")
    @Mapping(source = "petCountryId", target = "petCountry.id")
    @Mapping(source = "userId", target = "user.id")
    Pet toEntity(PetRequest petRequest);

    @Mapping(source = "petColor.color", target = "color")
    @Mapping(source = "petType.type", target = "type")
    @Mapping(source = "petCountry.country", target = "country")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "petCountry.id", target = "countryId")
    @Mapping(source = "petType.id", target = "typeId")
    @Mapping(source = "petColor.id", target = "colorId")
    PetResponse toDto(Pet pet);

    List<PetResponse> toDtos(List<Pet> pets);


    @Mapping(source = "petCountryId", target = "petCountry.id")
    @Mapping(source = "petTypeId", target = "petType.id")
    @Mapping(source = "petColorId", target = "petColor.id")
    Pet petUpdate(PetUpdateRequest petUpdateRequest);

}