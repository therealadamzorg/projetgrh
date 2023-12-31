package com.projetgrh.models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departements")
public class Departement {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nomDepartement;
	
	
	
	
	
	public Departement() {
		super();
	}
	public Departement(int id, String nomDepartement) {
		super();
		this.id = id;
		this.nomDepartement = nomDepartement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
    	
	
}
