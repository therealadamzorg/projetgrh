package com.projetgrh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="niveauetude")
public class NiveauEtude {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private int id;
	private String niveauEtude;
	
	public NiveauEtude(int id, String niveauEtude) {
		super();
		this.id = id;
		this.niveauEtude = niveauEtude;
	}
	public NiveauEtude() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNiveauEtude() {
		return niveauEtude;
	}
	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	
	
	
	

}
