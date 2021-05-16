package com.xworkz.exceptions.customexception.checkedexception.Dmart;

public class DmartPOSException extends Exception {
	
	@Override
	public String toString() {
		return "Not sufficient balance";
	}
	
	@Override
	public String getMessage() {
		return "transaction amount cant be 0";
	}

}
