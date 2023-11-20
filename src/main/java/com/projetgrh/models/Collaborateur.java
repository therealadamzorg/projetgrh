package com.projetgrh.models;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "collaborateur")
public class Collaborateur {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int cin;
	private String nomComplet;
	private int numCompte;
	private int numSS;
	private int numTel;
	private LocalDate dateNaiss;
	private String adresse;
	private String email;
	private String certification;
	private int anneeExp;
	private LocalDate dateDebutContrat;
	private LocalDate dateFinContrat;
	private int recommandation;
	private String collabRec;
	private String commentaire;
	public Collaborateur(int id, int cin, String nomComplet, int numCompte, int numSS, int numTel, LocalDate dateNaiss,
			String adresse, String email, String certification, int anneeExp, LocalDate dateDebutContrat,
			LocalDate dateFinContrat, int recommandation, String collabRec, String commentaire) {
		super();
		this.id = id;
		this.cin = cin;
		this.nomComplet = nomComplet;
		this.numCompte = numCompte;
		this.numSS = numSS;
		this.numTel = numTel;
		this.dateNaiss = dateNaiss;
		this.adresse = adresse;
		this.email = email;
		this.certification = certification;
		this.anneeExp = anneeExp;
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.recommandation = recommandation;
		this.collabRec = collabRec;
		this.commentaire = commentaire;
	}
	
	public Collaborateur() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public int getNumSS() {
		return numSS;
	}
	public void setNumSS(int numSS) {
		this.numSS = numSS;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public LocalDate getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public int getAnneeExp() {
		return anneeExp;
	}
	public void setAnneeExp(int anneeExp) {
		this.anneeExp = anneeExp;
	}
	public LocalDate getDateDebutContrat() {
		return dateDebutContrat;
	}
	public void setDateDebutContrat(LocalDate dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
	public LocalDate getDateFinContrat() {
		return dateFinContrat;
	}
	public void setDateFinContrat(LocalDate dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}
	public int getRecommandation() {
		return recommandation;
	}
	public void setRecommandation(int recommandation) {
		this.recommandation = recommandation;
	}
	public String getCollabRec() {
		return collabRec;
	}
	public void setCollabRec(String collabRec) {
		this.collabRec = collabRec;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
	
	
			

}
