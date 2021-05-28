package com.xworkz.collection.list.linked_list;

public class SoftDrink {
	
	String brand ;
	float price;
	int quantity;
	String color;
	
	@Override
	public String toString() {
		return "SoftDrink [brand=" + brand + ", price=" + price + ", quantity=" + quantity + ", color=" + color + "]";
	}

	public SoftDrink(String brand,float price,int quantity,String color) {
		
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
		this.color=color;
		
		
	}
	
	
}
