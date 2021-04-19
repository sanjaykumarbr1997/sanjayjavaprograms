package com.xworkz.objectclass.clone;

public class Clock implements Cloneable {
	
	String type;
	String brand;
	public Clock(String type,String brand) {
		this.type = type; 
		this.brand = brand;
		
	}
	@Override
	public String toString() {
		return "Clock [type=" + type + ", brand=" + brand + "]";
	}
		
		@Override
		public Object clone() throws CloneNotSupportedException { //this should always be public not protected

			return super.clone();
		}

}
