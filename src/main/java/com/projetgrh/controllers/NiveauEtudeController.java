package com.projetgrh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetgrh.models.NiveauEtude;
import com.projetgrh.services.NiveauEtudeService;

@RestController
@RequestMapping("/niveauetudes")
public class NiveauEtudeController {

	@Autowired
    private  NiveauEtudeService niveauEtudeService;

   

    @GetMapping
    public List<NiveauEtude> getAllNiveauEtude() {
    	     return niveauEtudeService.getAllNiveauEtude();
    	     
    }
    @PostMapping
    public void createNiveauEtude(@RequestBody NiveauEtude niveauEtude) {
    	niveauEtudeService.createNiveauEtude(niveauEtude);
      
    }

   
    }

  