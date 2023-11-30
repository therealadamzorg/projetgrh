package com.projetgrh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetgrh.models.Departement;

public interface  DepartementRepository extends JpaRepository<Departement, Integer> {

}
