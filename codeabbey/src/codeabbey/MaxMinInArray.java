package codeabbey;
import java.util.Scanner;
import java.util.Arrays;

public class MaxMinInArray {

	public static void main(String[] args) {
		
		int arrayTotal[] = {};
		//int max = arrayTotal[0];
		
		Scanner scc = new Scanner(System.in);
		
		int j= 0;
		for (j=0;j<100;j++) {
			arrayTotal[j] = scc.nextInt();
			
		}
		scc.close();
		
		System.out.println(Arrays.toString(arrayTotal));
		
		
		
		
		
		//int number1 = scc.nextInt();
		//int number2 = scc.nextInt();
		
		

	}

}
