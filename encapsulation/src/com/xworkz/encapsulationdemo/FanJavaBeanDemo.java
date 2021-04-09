package com.xworkz.encapsulationdemo;

public class FanJavaBeanDemo {

	public static void main(String[] args) {
		
		Fan fan = new Fan();
		
		fan.setBrand("Haier");
		fan.setColor("Black");
	 	fan.setnoOfBlades(2);
		fan.setRatings(3);
		
		System.out.println("Brand:"+fan.getBrand());
		System.out.println("Color:"+fan.getColor());
		System.out.println("Ratings:"+fan.getRatings());
		System.out.println("No of Blades:"+fan.getnoOfBlades());
		
		

	}

}
