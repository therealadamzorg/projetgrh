package com.projetgrh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contrats")
public class TypeContrats {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nomContrat;
	private int salaireDeBase;
	
	@ManyToOne
	private AvantageSurSalaire avantage;
	@ManyToOne
	private PieceJointe pieceJointe;
	
	
	
	public TypeContrats(int id, String nomContrat, int salaireDeBase, AvantageSurSalaire avantage,
			PieceJointe pieceJointe) {
		super();
		this.id = id;
		this.nomContrat = nomContrat;
		this.salaireDeBase = salaireDeBase;
		this.avantage = avantage;
		this.pieceJointe = pieceJointe;
	}
	public TypeContrats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AvantageSurSalaire getAvantage() {
		return avantage;
	}
	public void setAvantage(AvantageSurSalaire avantage) {
		this.avantage = avantage;
	}
	public PieceJointe getPieceJointe() {
		return pieceJointe;
	}
	public void setPieceJointe(PieceJointe pieceJointe) {
		this.pieceJointe = pieceJointe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomContrat() {
		return nomContrat;
	}
	public void setNomContrat(String nomContrat) {
		this.nomContrat = nomContrat;
	}
	public int getSalaireDeBase() {
		return salaireDeBase;
	}
	public void setSalaireDeBase(int salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}
	
	
	

}
