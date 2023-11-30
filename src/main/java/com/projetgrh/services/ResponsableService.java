package com.projetgrh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.Responsable;
import com.projetgrh.repositories.ResponsableRepository;

import java.util.List;

@Service
public class ResponsableService {
	 @Autowired
    private  ResponsableRepository responsableRepository;


    
    public List<Responsable> getAllResponsables() {
        return responsableRepository.findAll();
    }

	public Responsable createResponsable(Responsable responsable) {
		return responsableRepository.save(responsable);
	}

   

    
}
