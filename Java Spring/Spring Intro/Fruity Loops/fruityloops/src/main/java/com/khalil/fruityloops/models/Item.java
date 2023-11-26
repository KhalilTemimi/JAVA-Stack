package com.khalil.fruityloops.models;

public class Item {
	
	private String name;
	private double price;
	
	// zero-args CONSTRUCTOR
	public Item() {}

	// all-args Constructor
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	 

}
