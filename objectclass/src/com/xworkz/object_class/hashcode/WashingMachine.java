package com.xworkz.object_class.hashcode;

public class WashingMachine {
	
	String brand = "IFB";
	String color = "Silver";
	int rating = 5;
	String type = "Front Load";
	
	@Override
	public String toString() {
		return brand+" "+color+" "+rating+" "+type;
	}

}
