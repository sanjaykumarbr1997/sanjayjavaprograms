package com.xworkz.packages.javauserdefinedpackages;

import static com.xworkz.packages.javabuiltinpackage.Fruit.*; 
       //here static is used and you need to exactly specify the class name and star --compulsory

public class StaticImport {

	public static void main(String[] args) {
			
			
			//Fruit fruit2 = new Fruit();  -- SEE this is not required ,directly you can call the 
		                                      //member of that class ,u don't need to create object 
			
			System.out.println("fruit name:"+ fruit2Name);

	}

}
