package com.xworkz.exceptions.customexception.checkedexception.ATM;

public class ATMMachine {
	
	void draw(int amount) throws ATMException   {
		if(amount > 50000 || amount%100 !=0) {
			 ATMException atmExp = new ATMException();
			 throw atmExp;
			
		}
		else {
			System.out.println("Please collect cash");
		}
	}

}
