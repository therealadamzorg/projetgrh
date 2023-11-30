package com.projetgrh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.NatureEtude;
import com.projetgrh.models.Responsable;
import com.projetgrh.repositories.NatureEtudeRepository;
import com.projetgrh.repositories.ResponsableRepository;

import java.util.List;

@Service
public class NatureEtudeService {
	 @Autowired
    private  NatureEtudeRepository natureEtudeRepository;


    
    public List<NatureEtude> getAllNatureEtude() {
        return natureEtudeRepository.findAll();
    }

	public NatureEtude createNatureEtude(NatureEtude natureEtude) {
		return natureEtudeRepository.save(natureEtude);
	}

   

    
}
