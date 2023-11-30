package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetgrh.models.NiveauEtude;

public interface NiveauEtudeRepository extends JpaRepository<NiveauEtude, Integer> {
}
