package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetgrh.models.TypeContrat;
@Repository
public interface TypeContratsRepository extends JpaRepository<TypeContrat, Integer> {
    // You can add custom query methods if needed
}
