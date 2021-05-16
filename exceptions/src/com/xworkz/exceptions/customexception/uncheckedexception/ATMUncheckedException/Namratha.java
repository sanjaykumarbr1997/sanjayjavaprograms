package com.xworkz.exceptions.customexception.uncheckedexception.ATMUncheckedException;

public class Namratha {

	public static void main(String[] args) {
		
		ATMUMachine atmum = new ATMUMachine();
		
		int cash = 34005;
		
		
		try {
			atmum.draw(cash);
			
		} catch (ATMUException e) {

			if(cash>50000){
				System.out.println(e);
			}
			else {
				System.out.println(e.getMessage());
			}
		}
		
		

	}

}
