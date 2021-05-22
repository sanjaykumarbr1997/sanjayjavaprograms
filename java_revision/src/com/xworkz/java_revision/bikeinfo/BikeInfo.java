package com.xworkz.java_revision.bikeinfo;


public class BikeInfo {
	
	static String brand;
	static long price;
	static int mileage;
	static Model model;
	static CubicCapacity cc;
	
	
static void setInfo(String brandN  ,long priceN,int mileageN,Model modelN,CubicCapacity ccN) {
		
		brand= brandN;
		price= priceN;
		mileage= mileageN;
		model = modelN;
		cc = ccN;
	
		
		
	}
	
	static void displayAll() {
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("mileage:"+mileage);
		System.out.println("model:"+model);
		System.out.println("cc:"+cc);

	}


}
