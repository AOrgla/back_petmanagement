package com.example.petmanagement.domain.pet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetColorRepository extends JpaRepository<PetColor, Integer> {
}