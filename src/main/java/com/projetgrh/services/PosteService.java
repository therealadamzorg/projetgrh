package com.projetgrh.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.Poste;
import com.projetgrh.repositories.PosteRepository;

@Service
public class PosteService {
	
	@Autowired
	private PosteRepository posteRepository;
	
	public List<Poste> getAllPostes(int departementId){
		List<Poste> postes = new ArrayList<>();
		posteRepository.findByDepartementId(departementId).
		forEach(postes::add);
		return postes;
	}
	
	public void addPoste(Poste poste) {
		posteRepository.save(poste);
	}
	
	

}
