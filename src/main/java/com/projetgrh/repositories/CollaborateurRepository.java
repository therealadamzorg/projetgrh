package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetgrh.models.Collaborateur;

@Repository
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {
    
}
