package com.projetgrh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projetgrh.models.Responsable;
import com.projetgrh.services.ResponsableService;


@RestController
@RequestMapping("/responsables")
public class ResponsableController {

	@Autowired
    private  ResponsableService responsableService;

   

    @GetMapping
    public List<Responsable> getAllResponsables() {
    	     return responsableService.getAllResponsables();
    	     
    }
    @PostMapping
    public void createResponsable(@RequestBody Responsable responsable) {
         responsableService.createResponsable(responsable);
      
    }

   
    }

  

    
   
