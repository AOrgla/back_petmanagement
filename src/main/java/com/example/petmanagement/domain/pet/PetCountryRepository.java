package com.example.petmanagement.domain.pet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetCountryRepository extends JpaRepository<PetCountry, Integer> {
}