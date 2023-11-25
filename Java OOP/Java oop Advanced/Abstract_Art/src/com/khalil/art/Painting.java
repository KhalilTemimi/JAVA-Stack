package com.khalil.art;

public class Painting extends Art {
	private String paintType;


	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	@Override
	void viewArt() {
		System.out.println("Title: "+ this.getTitle()+"\n Author: "+ this.getAuthor()+
				"\n Description: "+ this.getDescription()+"\n Paint Type: "+ this.getPaintType());
	}
	
	public String getPaintType() {
		return paintType;
	}
	
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

}
