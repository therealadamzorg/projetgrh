package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetgrh.models.Responsable;

public interface ResponsableRepository extends JpaRepository<Responsable, Integer> {
    // Additional query methods can be added here if needed
}
