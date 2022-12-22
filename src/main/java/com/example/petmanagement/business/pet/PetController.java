package com.example.petmanagement.business.pet;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PetController {

    @Resource
    private PetManagementService petManagementService;

    @PostMapping("/pet")
    @Operation(summary ="Lets user add pets to the database")
    public void addPet(@RequestBody PetRequest petRequest) {
        petManagementService.addPet(petRequest);
    }

    @GetMapping("/pet")
    @Operation(summary = "Retrieves user's pets data from database")
    public List<PetResponse> getPetInfo(@RequestParam Integer userId) {
        return petManagementService.getPetsInfo(userId);
    }

    @GetMapping("/petdropdown")
    @Operation(summary = "Retrieves data from database to populate drop-down menus")
    public void getPetInfo() {

    }

    @PutMapping("/pet")
    @Operation(summary = "Updates pet info in database")
    public void updatePet(@RequestBody PetUpdateRequest petUpdateRequest) {
        petManagementService.updatePet(petUpdateRequest);
    }

}
