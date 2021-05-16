package com.xworkz.exceptions.customexception.uncheckedexception.DmartUncheckedException;

import com.xworkz.exceptions.customexception.checkedexception.Dmart.DmartPOSException;

public class James {

	public static void main(String[] args) {
		
		DmartBillingDeskU dbu = new DmartBillingDeskU();
		
		int amount = 5670;
	
		
		try {
			dbu.pay(amount);
		} catch (DmartPOSExceptionU e) {
			
			if(amount >34000) {
				System.out.println(e);
				
			}
			else {
				System.out.println(e.getMessage());
			}
		}
	}

}
