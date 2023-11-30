package com.projetgrh.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NatureEtude")
public class NatureEtude {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int id;
private String natureEtude;
public NatureEtude(int id, String natureEtude) {
	super();
	this.id = id;
	this.natureEtude = natureEtude;
}
public NatureEtude() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNatureEtude() {
	return natureEtude;
}
public void setNatureEtude(String natureEtude) {
	this.natureEtude = natureEtude;
}




	



	

}
