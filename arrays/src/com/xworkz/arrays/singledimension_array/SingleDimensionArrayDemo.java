package com.xworkz.arrays.singledimension_array;

public class SingleDimensionArrayDemo {
	
	static String array1[] = new String[6];
	public static void main(String[] args) {
		array1[0] = "Hello";
		array1[1] = "I";
		array1[2] = "am";
		array1[3] = "coding";
		array1[4] = "in";
		array1[5] = "java"; 
		
		for (int i=0; i< array1.length;i++) {
			System.out.println(array1[i]);
		}
		

	}

}
