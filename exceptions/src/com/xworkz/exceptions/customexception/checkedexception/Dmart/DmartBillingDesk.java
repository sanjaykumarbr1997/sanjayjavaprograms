package com.xworkz.exceptions.customexception.checkedexception.Dmart;

public class DmartBillingDesk {
	
	void pay(int amount) throws DmartPOSException {
		DmartPOSException de = new DmartPOSException();
		
		if(amount>34000 || amount==0) {
			
			throw de;
			
		}
		else {
			System.out.println("Payment is accepted ..Thank you");
		}
		
	}

}
