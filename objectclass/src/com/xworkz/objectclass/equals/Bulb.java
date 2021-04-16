package com.xworkz.objectclass.equals;

public class Bulb {
	
	String brand;
	String type;
	double price;
	
	public Bulb(String brand ,String type, double price) {
		this.brand= brand;
		this.type= type;
		this.price = price ;
		
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bulb other = (Bulb) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
}
