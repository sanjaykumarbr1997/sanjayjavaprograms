package com.xworkz.objectclass.clone;

public class Pen implements Cloneable {
	
	String brand;
	String color;
	Refill refill;
	
	public Pen(String brand, String color,Refill refill) {
		this.brand = brand;
		this.color = color;
		this.refill = refill;
		
	}
		
	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", color=" + color + ", refill=" + refill + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
