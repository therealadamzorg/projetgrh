package com.projetgrh.models;

public class Departement {
	
	private int id;
	private int nomDepartement;
	
	public Departement() {
		
	}
	
	public Departement(int id, int nomDepartement) {
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
	public int getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(int nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
    
	
}
