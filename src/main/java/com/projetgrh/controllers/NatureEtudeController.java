package com.projetgrh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projetgrh.models.NatureEtude;
import com.projetgrh.services.NatureEtudeService;


@RestController
@RequestMapping("/natureetudes")
public class NatureEtudeController {

	@Autowired
    private  NatureEtudeService natureEtudeService;

   

    @GetMapping
    public List<NatureEtude> getAllResponsables() {
    	     return natureEtudeService.getAllNatureEtude();
    	     
    }
    @PostMapping
    public void createResponsable(@RequestBody NatureEtude natureEtude) {
    	natureEtudeService.createNatureEtude(natureEtude);
      
    }

   
    }

  