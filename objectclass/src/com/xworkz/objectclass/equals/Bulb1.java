package com.xworkz.objectclass.equals;


public class Bulb1 {
	
	String brand;
	String type;
	double price;
	
	public Bulb1(String brand ,String type, double price) {
		this.brand= brand;
		this.type= type;
		this.price = price ;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Bulb) {
			Bulb bulb = (Bulb)obj;
			if(this.brand.equals(bulb.brand)) {
				if(this.type.equals(bulb.type)) {
					if(this.price == (bulb.price)) {
						return true;	
					}
					else {
						return false;
					}				
				}
				else {
					return false;
				}	
			}
			else {
				return false;
			}	
		}
		else {
			return false;
		}	
	}	
}
 