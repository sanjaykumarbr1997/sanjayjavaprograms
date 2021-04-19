package com.xworkz.objectclass.finalize;

public class Battery {
	String brand = "Luminous";
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	} 

 
}

