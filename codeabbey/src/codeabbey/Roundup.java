package codeabbey;
import java.util.Scanner;

public class Roundup {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int total = scn.nextInt();
		float result = 0;
		
		for(int i=0;i<total;i++) {
			
			float number1 = scn.nextInt();
			float number2 = scn.nextInt();
			
			
			result = number1/number2 ;
			int roundedFloat = Math.round(result);
			System.out.print(roundedFloat+" ");
			
			
			
		}
		scn.close();
		
		
		
		
		

	}

}
