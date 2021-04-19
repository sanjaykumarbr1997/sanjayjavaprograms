package com.xworkz.objectclass.clone;

public class Shirt implements Cloneable{
	
	String brand;
	String color;
	Button button;
	
	public Shirt(String brand, String color,Button button) {
	this.brand = brand;
	this.color = color;
	this.button = button;
	
	}
	
	@Override
		public Object clone() throws CloneNotSupportedException {
		
		Shirt shirt = (Shirt)super.clone();
		shirt.button = (Button) shirt.button.clone();
		return shirt;
	
	}

	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", color=" + color + ", button=" + button + "]";
	}
	
	
	
	
	

}
