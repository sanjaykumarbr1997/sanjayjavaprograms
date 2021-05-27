package com.xworkz.collection.list.array_list;

public class Tablet {
	
	String name;
	float price;
	int dateOfExpiry;
	String color;
	
	
	
	
	
	@Override
	public String toString() {
		return "Tablet [name=" + name + ", price=" + price + ", dateOfExpiry=" + dateOfExpiry + ", color=" + color
				+ "]";
	}


	public Tablet(String name , float price,int dateOfExpiry,String color) {
		
		this.name=name;
		this.price=price;
		this.dateOfExpiry=dateOfExpiry;
		this.color=color;
		
	}

}
