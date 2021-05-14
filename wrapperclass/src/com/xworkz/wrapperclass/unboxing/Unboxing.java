package com.xworkz.wrapperclass.unboxing;


public class Unboxing {

	public static void main(String[] args) {

		
		Integer i = 15;
		int j = i;   // auto unboxing
		int k = i.intValue() ; //explicit unboxing
		
		
		Float fa = 56.5f;
		float f1 = fa;
		//float f2 = f1.floatValue();
		
		Character c1 = 'p';
		char c2 = c1;
		//char c4 = c2.
				
				
		
		
		System.out.println(j);
		System.out.println(k);
		System.out.println(f1);
		System.out.println(c2);
	}

}
