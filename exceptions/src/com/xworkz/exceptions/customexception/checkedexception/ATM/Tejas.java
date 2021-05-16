package com.xworkz.exceptions.customexception.checkedexception.ATM;

public class Tejas {

	public static void main(String[] args) {
		
		ATMMachine atm = new ATMMachine();
		int amount = 20000;
		
		try {
			atm.draw(amount);
		} catch (ATMException e) {
			if(amount>50000) {
				System.out.println(e);
				//e.printStackTrace();
			}
			else {
				System.out.println(e.getMessage());
			}
		}
		
		
		

	}

}
