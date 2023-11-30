package com.projetgrh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetgrh.models.Departement;
import com.projetgrh.models.Poste;
import com.projetgrh.services.PosteService;


@RestController
@RequestMapping("/departements")
public class PosteController {

	@Autowired
	private PosteService posteService;
	
	@GetMapping("/{id}/postes")
	public List<Poste> getAllPostes(@PathVariable int id){
		return posteService.getAllPostes(id);
	}
	
	
	@PostMapping("/{departementId}/postes/")
    public void addPoste(@RequestBody Poste poste, @PathVariable int departementId) {
		poste.setDepartement(new Departement(departementId, ""));
		posteService.addPoste(poste);
	}
}
