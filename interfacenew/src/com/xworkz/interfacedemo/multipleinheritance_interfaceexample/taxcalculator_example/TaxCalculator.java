package com.xworkz.interfacedemo.multipleinheritance_interfaceexample.taxcalculator_example;

public class TaxCalculator implements StateTax,CentralTax {

	@Override
	public void incomeTax() {
		System.out.println("Income tax of Central");
		
	}

	@Override
	public void liqourTax() {
		System.out.println("Liqour tax of State");
		
	}
	
	

}
