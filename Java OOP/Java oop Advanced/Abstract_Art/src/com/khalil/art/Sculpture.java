package com.khalil.art;

public class Sculpture extends Art {
	
	private String material;
	

	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}

	@Override
	void viewArt() {
		System.out.println("Title: "+ this.getTitle()+"\n Author: "+ this.getAuthor()+
				"\n Description: "+ this.getDescription()+"\n Paint Type: "+ this.getMaterial());
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
