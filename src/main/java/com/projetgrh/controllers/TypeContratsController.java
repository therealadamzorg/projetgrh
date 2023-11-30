package com.projetgrh.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projetgrh.models.TypeContrat;
import com.projetgrh.models.TypeContrats;
import com.projetgrh.services.TypeContratsService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/typecontrat")
public class TypeContratsController {

    @Autowired
    private TypeContratsService typeContratsService;

    @GetMapping
    public List<TypeContrat> getAllTypeContrats() {
        return typeContratsService.getAllTypeContrats();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeContrat> getTypeContratById(@PathVariable int id) {
        Optional<TypeContrat> typeContrat = typeContratsService.getTypeContratById(id);
        return typeContrat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public TypeContrat saveTypeContrat(@RequestBody TypeContrat typeContrat) {
        return typeContratsService.saveTypeContrat(typeContrat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTypeContrat(@PathVariable int id) {
        typeContratsService.deleteTypeContrat(id);
        return ResponseEntity.ok().build();
    }
    
  
}
