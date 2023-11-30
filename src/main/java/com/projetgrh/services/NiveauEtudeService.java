package com.projetgrh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.projetgrh.models.NiveauEtude;

import com.projetgrh.repositories.NiveauEtudeRepository;


	@Service
	public class NiveauEtudeService {
		 @Autowired
	    private  NiveauEtudeRepository niveauEtudeRepository;


	    
	    public List<NiveauEtude> getAllNiveauEtude() {
	        return niveauEtudeRepository.findAll();
	    }

		public NiveauEtude createNiveauEtude(NiveauEtude  niveauEtude) {
			return niveauEtudeRepository.save( niveauEtude);
		}

	   

	    
	}
