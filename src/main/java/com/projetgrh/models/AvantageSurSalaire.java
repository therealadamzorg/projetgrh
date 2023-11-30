package com.projetgrh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avantagess")
public class AvantageSurSalaire {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String avantage;
	
	
	
	public AvantageSurSalaire() {
		super();
	}



	public AvantageSurSalaire(int id, String avantage) {
		super();
		this.id = id;
		this.avantage = avantage;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAvantage() {
		return avantage;
	}



	public void setAvantage(String avantage) {
		this.avantage = avantage;
	}
	
	
	

}
