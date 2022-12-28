package com.example.petmanagement.business.pet;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PetController {

    @Resource
    private PetManagementService petManagementService;

    @CrossOrigin
    @PostMapping("/pet")
    @Operation(summary ="Lets user add pets to the database")
    public void addPet(@RequestBody PetRequest petRequest) {
        petManagementService.addPet(petRequest);
    }

    @CrossOrigin
    @GetMapping("/pet")
    @Operation(summary = "Retrieves user's pets data from database")
    public List<PetResponse> getPetInfo(@RequestParam Integer userId) {
        return petManagementService.getPetsInfo(userId);
    }

    @CrossOrigin
    @PutMapping("/pet")
    @Operation(summary = "Updates pet info in database")
    public void updatePet(@RequestBody PetUpdateRequest petUpdateRequest) {
        petManagementService.updatePet(petUpdateRequest);
    }

    @CrossOrigin
    @DeleteMapping("/pet")
    @Operation(summary = "Let's user delete pet from database")
    public void deletePet(@RequestParam Long petCode) {
        petManagementService.deletePet(petCode);
    }

    @CrossOrigin
    @GetMapping("/petinfo")
    @Operation(summary = "Retrieves info for single pet")
    public PetResponse getSinglePetInfo(@RequestParam Long petCode) {
        return petManagementService.getSinglePetInfo(petCode);
    }
}
