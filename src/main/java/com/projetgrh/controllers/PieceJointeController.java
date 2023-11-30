package com.projetgrh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetgrh.models.Departement;
import com.projetgrh.models.PieceJointe;
import com.projetgrh.models.Poste;
import com.projetgrh.models.TypeContrat;
import com.projetgrh.services.PieceJointeService;
import com.projetgrh.services.PosteService;


	@RestController
	@RequestMapping("/typeContrats")
	public class PieceJointeController {

		@Autowired
		private PieceJointeService pieceJointeService;
		
		@GetMapping("/{id}/pieces")
		public List<PieceJointe> getAllPostes(@PathVariable int id){
			return pieceJointeService.getPieceJointe(id);
		}
		
		
		/*@PostMapping("/{typeContratId}/pieces/")
	    public void addPieceJointe(@RequestBody PieceJointe pieceJointe, @PathVariable int typeContratId) {
			pieceJointe.setTypeContrat(new TypeContrat(typeContratId, "", "", 0));
			pieceJointeService.addPieceJointe(pieceJointe);
		}*/
		
		/*@GetMapping("/getPiecesBycontrat/{id}")
		public List<PieceJointe> getPiecesBycontrat(@PathVariable("id") int id){
			return pieceJointeService.getPiececBytyp(id);
		}*/
	}


