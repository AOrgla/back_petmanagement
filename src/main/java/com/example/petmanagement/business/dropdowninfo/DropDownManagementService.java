package com.example.petmanagement.business.dropdowninfo;

import com.example.petmanagement.domain.pet.PetColor;
import com.example.petmanagement.domain.pet.PetCountry;
import com.example.petmanagement.domain.pet.PetService;
import com.example.petmanagement.domain.pet.PetType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DropDownManagementService {


    @Resource
    private PetService petService;

    public List<PetType> getPetTypeInfo() {
        return petService.getPetTypeInfo();
    }

    public List<PetCountry> getPetCountryInfo() {
        return petService.getPetCountryInfo();
    }

    public List<PetColor> getPetColorInfo() {
        return petService.getPetColorInfo();
    }
}
