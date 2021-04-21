package com.xworkz.arrays;

public class MultidimensionalArray {
	
	static int ar1[][] = new int [3][3];

	public static void main(String[] args) {
		ar1[0][0] = 0;
		ar1[0][1] =1;
		ar1[0][2] =2;
		ar1[1][0] =3;
		ar1[1][1]= 4;
		ar1[1][2]=5;
		ar1[2][0]=6;
		ar1[2][1]=7;
		ar1[2][2]=8;
		
		
		for(int i=0;i<ar1.length;i++) {
			System.out.print("[");
			for(int j=0;j<ar1.length;j++){
				System.out.print(" "+ar1[i][j]+" ");
				
			}
			System.out.println("]");
		}  
		
		
	}

}
