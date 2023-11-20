package com.projetgrh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.Collaborateur;
import com.projetgrh.repositories.CollaborateurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CollaborateurService {
	

    @Autowired
    private CollaborateurRepository collaborateurRepository;

    public List<Collaborateur> getAllCollaborateurs() {
        return collaborateurRepository.findAll();
    }

    public Optional<Collaborateur> getCollaborateurById(int id) {
        return collaborateurRepository.findById(id);
    }

    public Collaborateur saveCollaborateur(Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }

    public void deleteCollaborateur(int id) {
        collaborateurRepository.deleteById(id);
    }

	public void updateCollaborateur(int id, Collaborateur collaborateur) {
		collaborateurRepository.save(collaborateur);
	}
}
