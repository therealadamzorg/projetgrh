package com.projetgrh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.PieceJointe;
import com.projetgrh.models.TypeContrat;
import com.projetgrh.models.TypeContrats;
import com.projetgrh.repositories.PieceJointeRepository;
import com.projetgrh.repositories.TypeContratsRepository;

@Service
public class PieceJointeService {
	
	@Autowired
	private PieceJointeRepository pieceJointeRepository;
	@Autowired
	private TypeContratsRepository typeContratsRepository;
	
	public List<PieceJointe> getPieceJointe(int typeContratId){
		List<PieceJointe> pieceJointe = new ArrayList<>();
		pieceJointeRepository.findByTypeContratId(typeContratId).
		forEach(pieceJointe::add);
		return pieceJointe;
	}
	
	public void addPieceJointe(PieceJointe pieceJointe) {
		pieceJointeRepository.save(pieceJointe);
	}
	
	
	

}
