package com.example.petmanagement.business.pet;

import com.example.petmanagement.domain.pet.Pet;
import com.example.petmanagement.domain.pet.PetMapper;
import com.example.petmanagement.domain.pet.PetService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetManagementService {


    @Resource
    private PetService petService;
    @Resource
    private PetMapper petMapper;

    public List<PetResponse> getPetsInfo(Integer userId) {
        return petService.getPetInfo(userId);
    }

    public void addPet(PetRequest petRequest) {
        Pet pet = petMapper.toEntity(petRequest);
        petService.addPet(pet);
    }

    public void updatePet(PetUpdateRequest petUpdateRequest) {
        Pet pet = petMapper.petUpdate(petUpdateRequest);
        petService.updatePet(pet);
    }

    public void deletePet(Long code) {
        petService.deletePet(code);
    }

    public PetResponse getSinglePetInfo(Long petCode) {
        return petService.getSinglePetInfo(petCode);
    }
}
