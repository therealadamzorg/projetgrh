package com.projetgrh.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "type_Contrat")
public class TypeContrat {
   
	@Id
   private int id;	
   private String typeContrat;
   private String avantageSurSalaire;
   private int salaireDeBase;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTypeContrat() {
	return typeContrat;
}
public void setTypeContrat(String typeContrat) {
	this.typeContrat = typeContrat;
}
public String getAvantageSurSalaire() {
	return avantageSurSalaire;
}
public void setAvantageSurSalaire(String avantageSurSalaire) {
	this.avantageSurSalaire = avantageSurSalaire;
}
public int getSalaireDeBase() {
	return salaireDeBase;
}
public void setSalaireDeBase(int salaireDeBase) {
	this.salaireDeBase = salaireDeBase;
}
public TypeContrat(int id, String typeContrat, String avantageSurSalaire, int salaireDeBase) {
	super();
	this.id = id;
	this.typeContrat = typeContrat;
	this.avantageSurSalaire = avantageSurSalaire;
	this.salaireDeBase = salaireDeBase;
}
public TypeContrat() {
	super();
	// TODO Auto-generated constructor stub
}
  
   

   

	
   
}
