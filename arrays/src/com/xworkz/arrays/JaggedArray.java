package com.xworkz.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][]array1 = new int[4][]; 
		array1[0] = new int[3];
		array1[1] = new int[2];
		array1[2] = new int[4];
		array1[3] = new int[1];
		

		
		int j=0;
		for(int i=0;i<array1.length;i++) {
			for(int count=0;count<array1[i].length;count++ ,j++) {
				array1[i][count]=j;
				System.out.print(array1[i][count]);
				
			}
			System.out.println();
		}
		
		



		
		
		

	}
}
