package com.xworkz.exceptions.customexception.uncheckedexception.DmartUncheckedException;

public class DmartBillingDeskU  {
	
	void pay(int amount) {
		DmartPOSExceptionU dpe = new DmartPOSExceptionU();
		
		if(amount>34000 || amount==0) {
			throw dpe;
		}
		else {
			System.out.println("transaction success");
		}
	}
	
	

}
