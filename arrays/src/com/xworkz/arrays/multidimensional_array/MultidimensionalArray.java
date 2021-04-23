package com.xworkz.arrays.multidimensional_array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int ar1[][] = new int [3][3];
		
		int p = 0;
		for(int i=0;i<ar1.length;i++) {
		
			System.out.print("[");
			for(int j=0;j<ar1.length;j++ ,p++){
				ar1[i][j]=p;
				
				System.out.print(" "+ar1[i][j]+" ");	
			}
			System.out.println("]");
		}  	
		System.out.println("------------");
		
		char ch[][] = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}};
		for(int i=0;i<ch.length;i++) {
			
			System.out.print("[");
			for(int m=0;m<ch[i].length;m++){
				
				System.out.print(" "+ch[i][m]+" ");	
			}
			System.out.println("]");
			
		}
			
	}
}
