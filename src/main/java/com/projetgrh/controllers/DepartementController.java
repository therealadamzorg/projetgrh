package com.projetgrh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projetgrh.models.Departement;
import com.projetgrh.services.DepartementService;

import java.util.List;

@RestController
@RequestMapping("/departements")
public class DepartementController {

    @Autowired
    private DepartementService departementService;

    // Create
    @PostMapping("/")
    public Departement createDepartement(@RequestBody Departement departement) {
        return departementService.createDepartement(departement);
    }

    // Read
    @GetMapping("/")
    public List<Departement> getAllDepartements() {
        return departementService.getAllDepartements();
    }

    @GetMapping("/{id}")
    public Departement getDepartementById(@PathVariable int id) {
        return departementService.getDepartementById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Departement updateDepartement(@PathVariable int id, @RequestBody Departement updatedDepartement) {
        return departementService.updateDepartement(id, updatedDepartement);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteDepartement(@PathVariable int id) {
        departementService.deleteDepartement(id);
    }
}
