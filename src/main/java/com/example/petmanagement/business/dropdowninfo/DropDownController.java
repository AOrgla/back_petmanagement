package com.example.petmanagement.business.dropdowninfo;

import com.example.petmanagement.domain.pet.PetColor;
import com.example.petmanagement.domain.pet.PetCountry;
import com.example.petmanagement.domain.pet.PetType;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DropDownController {

    @Resource
    private DropDownManagementService dropDownManagementService;

    @GetMapping("/petcountry")
    @Operation(summary = "Retrieves country data from database to populate drop-down menus")
    public List<PetCountry> getPetCountryInfo() {
        return dropDownManagementService.getPetCountryInfo();
    }

    @GetMapping("/pettype")
    @Operation(summary = "Retrieves pet type data from database to populate drop-down menus")
    public List<PetType> getPetTypeInfo() {
        return dropDownManagementService.getPetTypeInfo();
    }

    @GetMapping("/petcolor")
    @Operation(summary = "Retrieves color data from database to populate drop-down menus")
    public List<PetColor> getPetColorInfo() {
        return dropDownManagementService.getPetColorInfo();
    }

}
