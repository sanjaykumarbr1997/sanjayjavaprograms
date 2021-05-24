package com.xworkz.java_revision.bikeinfo;


public class BikeInfoTester {

	public static void main(String[] args) {
		
		
		BikeInfo.displayAll();
		
		BikeInfo.setInfo("Bajaj",65000l,25,Model.TWENTY_TWENTY.getyearInWords(),CubicCapacity.CC_150) ;
		
		BikeInfo.displayAll();


	}

}
