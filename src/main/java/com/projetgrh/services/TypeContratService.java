package com.projetgrh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetgrh.models.PieceJointe;
import com.projetgrh.models.TypeContrat;
import com.projetgrh.repositories.PieceJointeRepository;
import com.projetgrh.repositories.TypeContratRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TypeContratService {
	@Autowired
    private  TypeContratRepository typeContratRepository;
	@Autowired
	private PieceJointeRepository pieceJointeRepository;

    @Autowired
    public TypeContratService(TypeContratRepository typeContratRepository) {
        this.typeContratRepository = typeContratRepository;
    }

    public List<TypeContrat> getAllTypeContrats() {
        return typeContratRepository.findAll();
    }

    public Optional<TypeContrat> getTypeContratById(int id) {
        return typeContratRepository.findById(id);
    }

    public TypeContrat saveTypeContrat(TypeContrat typeContrat) {
        return typeContratRepository.save(typeContrat);
    }

    public void deleteTypeContrat(int id) {
        typeContratRepository.deleteById(id);
    }
    
        public List<PieceJointe> getPiececBytyp(int idTypc){
		
		/*TypeContrat contrat=typeContratsRepository.findById(idTypc).get();
		List<PieceJointe>pieces=contrat.getPieces();*/
        	
        	List<PieceJointe> pieces=pieceJointeRepository.findByTypeContratId(idTypc);
				
		return pieces;
		
	}
}
