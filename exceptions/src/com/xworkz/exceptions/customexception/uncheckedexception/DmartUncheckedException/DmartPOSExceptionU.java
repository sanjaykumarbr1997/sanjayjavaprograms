package com.xworkz.exceptions.customexception.uncheckedexception.DmartUncheckedException;

public class DmartPOSExceptionU extends RuntimeException {

	@Override
	public String toString() {
		return "No sufficient balance";
	}
	
	@Override
	public String getMessage() {
		return "transaction cant be zero";
	}
	
	
}
