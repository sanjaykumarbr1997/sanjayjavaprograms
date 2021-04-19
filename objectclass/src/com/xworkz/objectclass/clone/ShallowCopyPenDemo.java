package com.xworkz.objectclass.clone;

public class ShallowCopyPenDemo {

	public static void main(String[] args) throws CloneNotSupportedException   {
		
		Refill refill = new Refill();
		Pen pen1 = new Pen("Reynolds","Blue",refill);
		Pen pen2 = new Pen("Cello","Black",refill);
		Pen pen3 = null;
		
		System.out.println("pen2 :"+pen2 );

		pen3=(Pen)pen2.clone();
		pen3.refill.price = 56 ;
		System.out.println("pen3 :"+pen3 );
		System.out.println("pen2 :"+pen2 );

		
		
		


	}

}
