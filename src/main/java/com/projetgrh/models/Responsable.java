package com.projetgrh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="responsable")
public class Responsable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nomResponsable;
	public Responsable(int id, String nomResponsable) {
		super();
		this.id = id;
		this.nomResponsable = nomResponsable;
	}
	public Responsable() {
        
    }
	
	public int getId() {
		return id;
	}
	
	public String getNomResponsable() {
		return nomResponsable;
	}
	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
	
	

	
	

}
