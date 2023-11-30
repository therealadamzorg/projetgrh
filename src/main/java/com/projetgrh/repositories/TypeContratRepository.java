package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetgrh.models.TypeContrat;

public interface TypeContratRepository extends JpaRepository<TypeContrat, Integer> {
    
}
