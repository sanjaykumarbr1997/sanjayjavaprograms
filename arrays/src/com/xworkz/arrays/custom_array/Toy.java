package com.xworkz.arrays.custom_array;

public class Toy {
	
	String name;
	String color;
	double price;
	
	public Toy(String name,String color,double price) {
		this.name = name;
		this.color= color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	

}
