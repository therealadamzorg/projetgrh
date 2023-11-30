package com.projetgrh.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="poste")
public class Poste {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nomPoste;
	@ManyToOne
	private Departement departement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomPoste() {
		return nomPoste;
	}
	public void setNomPoste(String nomPoste) {
		this.nomPoste = nomPoste;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public Poste(int id, String nomPoste, int departementId) {
		super();
		this.id = id;
		this.nomPoste = nomPoste;
		this.departement = new Departement(departementId, "");
	}
	public Poste() {
		super();
		
	}
	
	
	
	
	
	
	
}
