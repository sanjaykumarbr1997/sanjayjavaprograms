package com.xworkz.encapsulation;

public class FridgeDemo {

	public static void main(String[] args) {
		
		Fridge fridge = new Fridge();
		
		fridge.setBrand("Haier");
		fridge.setColor("Black");
	 	fridge.setNoOfDoors(2);
		fridge.setRatings(3);
		
		System.out.println("Brand:"+fridge.getBrand());
		System.out.println("Color:"+fridge.getColor());
		System.out.println("Ratings:"+fridge.getRatings());
		System.out.println("No of Doors:"+fridge.getNoOfDoors());
		
		

	}

}
