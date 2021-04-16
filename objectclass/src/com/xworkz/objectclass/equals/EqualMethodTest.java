package com.xworkz.objectclass.equals;

public class EqualMethodTest {

public static void main(String[] args) {
		
		Bulb bulb1 = new Bulb("Philips","LED",20.00);
		Bulb bulb2 = new Bulb("Wipro","CFL",30.00);
		Bulb bulb3 = new Bulb("Philips","LED",20.00);

		
		System.out.println(bulb1.equals(bulb2));
		System.out.println(bulb1.equals(bulb3));
		System.out.println(bulb1.getClass());
		System.out.println();
		
		
	}

}