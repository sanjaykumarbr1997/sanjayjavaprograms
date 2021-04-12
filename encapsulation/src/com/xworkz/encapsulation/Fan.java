package com.xworkz.encapsulation;

public class Fan {
	
	private String color;
	private String brand;
	private int noOfBlades;
	private int ratings;
	
	public Fan() {
		System.out.println("Printing from default constructor");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getnoOfBlades() {
		return noOfBlades;
	}
	public void setnoOfBlades(int noOfBlades) {
		
		if ((noOfBlades <0) || (noOfBlades>4)) {
			System.out.println("Invalid input for noOfBlades");
			this.noOfBlades =0;
			return;
		}
		this.noOfBlades = noOfBlades;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		if ((ratings <0) || (ratings>5)) {
			System.out.println("Invalid input for ratings");
			this.ratings =0;
			return;
		}
		this.ratings = ratings;
	}
	
	

}
