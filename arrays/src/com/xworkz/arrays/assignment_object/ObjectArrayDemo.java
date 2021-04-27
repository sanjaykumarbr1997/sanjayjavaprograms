package com.xworkz.arrays.assignment_object;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		
		Blazer blazer1 = new Blazer("Raymonds","Blue");
		Blazer blazer2 = new Blazer("PeterEngland","Black");
		Helmet helmet1 = new Helmet("Vega","White");
		Helmet helmet2 = new Helmet("Studds","Red");
		Perfume perfume1 = new Perfume("Fogg","Blue");
		Perfume perfume2 = new Perfume("Axe","Green");
		Shoe shoe1 = new Shoe("Puma","Pink");
		Shoe shoe2 = new Shoe("Sparx","Violet");
		
	
		Object [] objects= {blazer1,blazer2,helmet1,helmet2,perfume1,perfume2,shoe1,shoe2};
				
		for(Object obj11 : objects) {
			System.out.println(obj11);
		} 
		
		System.out.println("-------");
		
		System.out.println("Names of perfume");
		for(Object obj11 : objects) {
			if(obj11 instanceof Perfume) {
				Perfume perf = (Perfume)obj11;
				System.out.println(perf.name +" ");
			}
			
		} 
	}

}
