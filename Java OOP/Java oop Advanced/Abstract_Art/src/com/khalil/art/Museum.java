package com.khalil.art;

import java.util.ArrayList;

public class Museum {

	public static void main(String[] args) {
		
		ArrayList<Art> musuem = new ArrayList<Art>();
		
		Painting paint1 = new Painting("title1","author1","paint1","oil");
		musuem.add(paint1);
		Painting paint2 = new Painting("title2","author2","paint2","water color");
		musuem.add(paint2);
		Painting paint3 = new Painting("title3","author3","paint3","acrylic");
		musuem.add(paint3);
		
		Sculpture scult1 = new Sculpture("title4","author4","scult1","marbre");
		musuem.add(scult1);
		Sculpture scult2 = new Sculpture("title5","author5","scult2","bronze");
		musuem.add(scult2);
		
		for (Art art : musuem) {
			art.viewArt();
		}
	}

}
