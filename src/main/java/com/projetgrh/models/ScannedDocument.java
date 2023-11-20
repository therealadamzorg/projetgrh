package com.projetgrh.models;

public class ScannedDocument {
	
	private int id;
	private String documentSccannee;
	
	public ScannedDocument() {
		
	}
	public ScannedDocument(int id, String documentSccannee) {
		super();
		this.id = id;
		this.documentSccannee = documentSccannee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocumentSccannee() {
		return documentSccannee;
	}
	public void setDocumentSccannee(String documentSccannee) {
		this.documentSccannee = documentSccannee;
	}
	
	

}
