package com.xworkz.encapsulation;

public class Fridge {
	
	private String color;
	private String brand;
	private int noOfDoors;
	private int ratings;
	
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
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		
		if ((noOfDoors <0) || (noOfDoors>2)) {
			System.out.println("Invalid input for noOfDoors");
			this.noOfDoors =0;
			return;
		}
		this.noOfDoors = noOfDoors;
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
