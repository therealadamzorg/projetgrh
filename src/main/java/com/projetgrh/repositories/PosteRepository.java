package com.projetgrh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetgrh.models.Poste;



public interface PosteRepository extends JpaRepository<Poste, Integer>{

	
	List<Poste> findByDepartementId(int departementId);
	

}
