package com.xworkz.exceptions.customexception.uncheckedexception.ATMUncheckedException;

public class ATMUException extends RuntimeException {
	
	
	@Override
	public String toString() {
		return "you are crossing the transaction limit";
	}
	
	@Override
	public String getMessage() {
		return "invalid input";
	}


	

}
