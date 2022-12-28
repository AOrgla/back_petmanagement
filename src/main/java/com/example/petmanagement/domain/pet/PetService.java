package com.example.petmanagement.domain.pet;

import com.example.petmanagement.business.pet.PetResponse;
import com.example.petmanagement.validation.Validation;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Resource
    private PetRepository petRepository;

    @Resource
    private PetTypeRepository petTypeRepository;

    @Resource
    private PetCountryRepository petCountryRepository;

    @Resource
    private PetColorRepository petColorRepository;

    @Resource
    private PetMapper petMapper;


    public List<PetResponse> getPetInfo(Integer userId) {
        List<Pet> pet = petRepository.findByUserId(userId);
        return petMapper.toDtos(pet);
    }

    public void addPet(Pet pet) {
        List<Pet> allPets = petRepository.findAll();
        Validation.validatePetExists(pet, allPets);
        Validation.validateCodeLength(pet);
        petRepository.save(pet);
    }

    public void updatePet(Pet pet) {
        petRepository.updatePetByCode(pet.getPetColor(),
                pet.getPetType(), pet.getPetCountry(), pet.getName(), pet.getCode());
    }

    public List<PetType> getPetTypeInfo() {
        return petTypeRepository.findAll();
    }

    public List<PetCountry> getPetCountryInfo() {
        return petCountryRepository.findAll();
    }

    public List<PetColor> getPetColorInfo() {
        return petColorRepository.findAll();
    }

    public void deletePet(Long code) {
        petRepository.deleteByCode(code);
    }

    public PetResponse getSinglePetInfo(Long petCode) {
        Pet pet =  petRepository.findByCode(petCode);
        return petMapper.toDto(pet);
    }
}
