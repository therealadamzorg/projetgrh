package com.projetgrh.models;

public class Document {

	private int id;
	private String document;
	
	public Document() {
		
	}
	
	public Document(int id, String document) {
		super();
		this.id = id;
		this.document = document;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	
	
}
