package com.projetgrh.models;

public class Responsable {
	
	private int id;
	private String nomResponsable;
	
	public Responsable(int id, String nomResponsable) {
		super();
		this.id = id;
		this.nomResponsable = nomResponsable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
	
	

}
