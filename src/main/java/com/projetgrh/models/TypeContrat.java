package com.projetgrh.models;

public class TypeContrat {

   private String typeContrat;
   private String avantageSurSalaire;
   private int salaireDeBase;
  
   public TypeContrat() {
		
	}
   
   
 public TypeContrat(String typeContrat, String avantageSurSalaire, int salaireDeBase) {
	super();
	this.typeContrat = typeContrat;
	this.avantageSurSalaire = avantageSurSalaire;
	this.salaireDeBase = salaireDeBase;
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
	
   
}
