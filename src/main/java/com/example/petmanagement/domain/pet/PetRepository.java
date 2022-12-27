package com.example.petmanagement.domain.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Integer> {


    @Query("select p from Pet p where p.user.id = ?1")
    List<Pet> findByUserId(Integer id);

    @Transactional
    @Modifying
    @Query("update Pet p set p.petColor = ?1, p.petType = ?2, p.petCountry = ?3, p.name = ?4 where p.code = ?5")
    int updatePetByCode(PetColor petColor, PetType petType, PetCountry petCountry, String name, Long code);

    @Transactional
    @Modifying
    @Query("delete from Pet p where p.code = ?1")
    void deleteByCode(Long code);

}