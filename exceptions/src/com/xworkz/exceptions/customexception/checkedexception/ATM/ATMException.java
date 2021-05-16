package com.xworkz.exceptions.customexception.checkedexception.ATM;

public class ATMException extends Exception {
	
	

	
	@Override
	public String toString() {
		return "Sorry... your crossing the limit";
	}
	
	@Override
	public String getMessage() {
		return "Invalid amount";
	}
	
	

	

}

