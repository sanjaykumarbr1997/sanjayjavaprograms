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
		
		Object obj120 = new Perfume("Name","Color");  //while creating object you need to create with parameter ,be careful
		Perfume p1 = (Perfume)obj120;
		
		Object obj121 = new Shoe("Name","Color");  //while creating object you need to create with parameter ,be careful
		Shoe s1 = (Shoe)obj121;
		
		Object obj122 = new Blazer("Name","Color");  //while creating object you need to create with parameter ,be careful
		Blazer b1 = (Blazer)obj122;
		
		Object obj123 = new Helmet("Name","Color");  //while creating object you need to create with parameter ,be careful
		Helmet h1 = (Helmet)obj123;

		
		for(Object obj11 : objects) {
			System.out.println(obj11);
		} 
		
		System.out.println("-------");
		
		System.out.println("Names of objects");
		for(Object obj11 : objects) {
			if(obj11 instanceof Perfume) {
				System.out.print(((Perfume) obj11).name +" ");
			}
			
			else if (obj11 instanceof Blazer) {
				System.out.print(((Blazer) obj11).name + " ");
				
			}
			else if (obj11 instanceof Helmet) {
				System.out.print(((Helmet) obj11).name +" ");
				
			}
			else if (obj11 instanceof Shoe) {
		
				System.out.print(((Shoe) obj11).name+ " ");
			}
			
		} 
	}

}
