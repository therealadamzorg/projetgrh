package com.projetgrh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetgrh.models.PieceJointe;

@Repository
public interface PieceJointeRepository extends JpaRepository<PieceJointe, Integer>{

	
	List<PieceJointe> findByTypeContratId(int typeContratId);
	
	//List<PieceJointe> findByTypeContratTypeContratId(int typeContratId);


}
