package com.projetgrh.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="piecejointe")
public class PieceJointe {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String pieceJointe;
	@ManyToOne
	TypeContrat typeContrat;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPieceJointe() {
		return pieceJointe;
	}
	public void setPieceJointe(String pieceJointe) {
		this.pieceJointe = pieceJointe;
	}
	public PieceJointe(int id, String pieceJointe) {
		super();
		this.id = id;
		this.pieceJointe = pieceJointe;
	}
	public PieceJointe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
