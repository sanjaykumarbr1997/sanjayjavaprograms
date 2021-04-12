package codeabbey;
import java.util.Scanner;
import java.util.Arrays;

public class MaxMinInArray {

	public static void main(String[] args) {
		
		int total = 300;
		
		Scanner scc = new Scanner(System.in);
		int array4 [] = new int[total];
		
		int max = 0;
		int min =0;
		for (int j=0;j<300;j++) {
			
			int input = scc.nextInt();
			array4[j]=input;
			
			if (input > max) {
				max = input;
			
			}
			
			else if(input<min){
				min =input;
			}
	
	
			
			
		}
		scc.close();
		System.out.println(max+" "+min);

		
		
		
		
		
		
		

	}

}
