package com.projetgrh.models;

public class Poste {

	private int id;
	private int nomPoste;
	
	
	public Poste() {
		
	}
	public Poste(int id, int nomPoste) {
		super();
		this.id = id;
		this.nomPoste = nomPoste;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNomPoste() {
		return nomPoste;
	}
	public void setNomPoste(int nomPoste) {
		this.nomPoste = nomPoste;
	}
	
	
}
