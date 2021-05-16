package com.xworkz.exceptions.customexception.checkedexception.Dmart;

public class Robert {

	public static void main(String[] args) {
		
		DmartBillingDesk db = new DmartBillingDesk();
		
		int amount = 60000;
		
		try {
			db.pay(amount);
		} catch (DmartPOSException e) {
			
			if(amount >34000) {
				System.out.println(e);
				
			}
			else {
				System.out.println(e.getMessage());
			}
		}

	}

}
