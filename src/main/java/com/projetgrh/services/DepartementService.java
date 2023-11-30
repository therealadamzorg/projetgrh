package com.projetgrh.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.Departement;
import com.projetgrh.repositories.DepartementRepository;

import java.util.List;

@Service
public class DepartementService  {

    @Autowired
    private DepartementRepository departementRepository;

   public Departement createDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

   
    public List<Departement> getAllDepartements() {
        return departementRepository.findAll();
    }

   
    public Departement getDepartementById(int id) {
        return departementRepository.findById(id).orElse(null);
    }

    
    public Departement updateDepartement(int id, Departement updatedDepartement) {
        Departement existingDepartement = departementRepository.findById(id).orElse(null);

        if (existingDepartement != null) {
            existingDepartement.setNomDepartement(updatedDepartement.getNomDepartement());
            return departementRepository.save(existingDepartement);
        } else {
            return null; // Handle not found case
        }
    }

   
    public void deleteDepartement(int id) {
        departementRepository.deleteById(id);
    }
}

