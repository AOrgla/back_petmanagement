package com.example.petmanagement.domain.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Integer> {
    @Transactional
    @Modifying
    @Query("""
            update Pet p set p.petColor = ?1, p.petType = ?2, p.petCountry = ?3, p.name = ?4, p.code = ?5
            where p.id = ?6""")
    void updatePetById(PetColor petColor, PetType petType, PetCountry petCountry, String name, Long code, Integer id);


    @Query("select p from Pet p where p.user.id = ?1")
    List<Pet> findByUserId(Integer id);

}