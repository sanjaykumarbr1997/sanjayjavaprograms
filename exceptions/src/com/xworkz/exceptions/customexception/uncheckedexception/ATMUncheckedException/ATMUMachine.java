package com.xworkz.exceptions.customexception.uncheckedexception.ATMUncheckedException;

public class ATMUMachine {
	
	void draw(int cash)  {
		if(cash>50000||cash%100!=0) {
			ATMUException atmu = new ATMUException();
			
			throw atmu;
		}
		else {
			System.out.println("Collect cash ");
		}
	}
}
