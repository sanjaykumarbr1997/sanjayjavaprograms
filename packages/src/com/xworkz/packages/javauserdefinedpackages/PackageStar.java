package com.xworkz.packages.javauserdefinedpackages;
import com.xworkz.packages.javabuiltinpackage.*;

public class PackageStar {
	
	public static void main(String[] args) {
		
		
		Fruit fruit = new Fruit();
		
		System.out.println("fruit name:"+ fruit.fruitName); 
		     //see , to access fruitName, make String public in Fruit class as it is in default
		     //see class from another package is used here 
		
	}

}
