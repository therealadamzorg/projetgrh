package com.projetgrh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.TypeContrat;
import com.projetgrh.models.TypeContrats;
import com.projetgrh.repositories.TypeContratsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TypeContratsService {

    @Autowired
    private TypeContratsRepository typeContratsRepository;

    public List<TypeContrat> getAllTypeContrats() {
        return typeContratsRepository.findAll();
    }

    public Optional<TypeContrat> getTypeContratById(int id) {
        return typeContratsRepository.findById(id);
    }

    public TypeContrat saveTypeContrat(TypeContrat typeContrat) {
        return typeContratsRepository.save(typeContrat);
    }

    public void deleteTypeContrat(int id) {
        typeContratsRepository.deleteById(id);
    }
}
