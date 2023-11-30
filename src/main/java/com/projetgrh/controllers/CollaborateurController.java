package com.projetgrh.controllers; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projetgrh.models.Collaborateur;
import com.projetgrh.services.CollaborateurService;

import java.util.List;
	import java.util.Optional;

	@RestController
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/collaborateurs")
	public class CollaborateurController {

	    @Autowired
	    private CollaborateurService collaborateurService;

	    @GetMapping
	    public List<Collaborateur> getAllCollaborateurs() {
	        return collaborateurService.getAllCollaborateurs();
	    }

	    @GetMapping("/{id}")
	    public Optional<Collaborateur> getCollaborateurById(@PathVariable int id) {
	        return collaborateurService.getCollaborateurById(id);
	    }

	    @PostMapping
	    public Collaborateur saveCollaborateur(@RequestBody Collaborateur collaborateur) {
	        return collaborateurService.saveCollaborateur(collaborateur);
	    }
	    
	    @PutMapping("/{id}")
	    public void updateCollaborateur(@RequestBody Collaborateur collaborateur, @PathVariable int id) {
	         collaborateurService.updateCollaborateur(id, collaborateur);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCollaborateur(@PathVariable int id) {
	        collaborateurService.deleteCollaborateur(id);
	    }
	    @GetMapping("/total-salaire-brut")
	    public Double getTotalSalaireBrut() {
	        return collaborateurService.calculateTotalSalaireBrut();
	    }
	}


