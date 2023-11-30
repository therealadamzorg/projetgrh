package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetgrh.models.NatureEtude;

public interface NatureEtudeRepository extends JpaRepository<NatureEtude, Integer> {
    // Additional query methods can be added here if needed
}
