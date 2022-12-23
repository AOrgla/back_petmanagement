package com.example.petmanagement.domain.pet;

import com.example.petmanagement.business.pet.PetResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        petRepository.save(pet);
    }

    public void updatePet(Pet pet) {
        petRepository.updatePetById(pet.getPetColor(),
                pet.getPetType(), pet.getPetCountry(), pet.getName(), pet.getCode(), pet.getId());
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
}
