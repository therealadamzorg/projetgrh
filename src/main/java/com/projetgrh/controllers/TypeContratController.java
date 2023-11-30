package com.projetgrh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projetgrh.models.PieceJointe;
import com.projetgrh.models.TypeContrat;
import com.projetgrh.services.TypeContratService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/typeContrats")
public class TypeContratController {
    
	@Autowired
    private  TypeContratService typeContratService;

   

    @GetMapping
    public List<TypeContrat> getAllTypeContrats() {
        return typeContratService.getAllTypeContrats();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeContrat> getTypeContratById(@PathVariable int id) {
        Optional<TypeContrat> typeContrat = typeContratService.getTypeContratById(id);
        return typeContrat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<TypeContrat> createTypeContrat(@RequestBody TypeContrat typeContrat) {
        TypeContrat createdTypeContrat = typeContratService.saveTypeContrat(typeContrat);
        return ResponseEntity.ok(createdTypeContrat);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TypeContrat> updateTypeContrat(@PathVariable int id, @RequestBody TypeContrat updatedTypeContrat) {
        if (typeContratService.getTypeContratById(id).isPresent()) {
            updatedTypeContrat.setId(id);
            TypeContrat savedTypeContrat = typeContratService.saveTypeContrat(updatedTypeContrat);
            return ResponseEntity.ok(savedTypeContrat);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTypeContrat(@PathVariable int id) {
        if (typeContratService.getTypeContratById(id).isPresent()) {
            typeContratService.deleteTypeContrat(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/getPiecesBycontrat/{id}")
  	public List<PieceJointe> getPiecesBycontrat(@PathVariable("id") int id){
  		return typeContratService.getPiececBytyp(id);
  	}
}
