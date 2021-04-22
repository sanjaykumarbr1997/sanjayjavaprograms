package com.xworkz.arrays;

public class EvenArray {
	public static void main(String[] args) {
		int aray1[][] = new int [4][4];
		
		for(int i=0;i<aray1.length;i++) {
			
			int number = 2;	
			for(int j=0;j<aray1.length;j++,number++) {
				
				aray1[i][j]=number;
				number++;
			
				System.out.print(" "+aray1[i][j]+" ");
			
			}
			System.out.println();
			
		}  	

	}

}
