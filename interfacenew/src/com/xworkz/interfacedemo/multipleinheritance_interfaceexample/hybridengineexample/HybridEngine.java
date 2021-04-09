package com.xworkz.interfacedemo.multipleinheritance_interfaceexample.hybridengineexample;

public class HybridEngine implements Diesel,Electric {

	@Override
	public void runsOnCurrent() {
		
		System.out.println("Vehicle runs on diesel at high speeds");
		
	}

	@Override
	public void runsOnDiesel() {
		
		System.out.println("Vehicle run on current at low speed");
		
	}

	
		
		
	

}
