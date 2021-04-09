package scanner;

import java.util.Scanner;

public class MinimumOfThree {

	public static void main(String[] args){
		
		System.out.println("Enter the data");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		

		
		
		
		for(int j=0; j<total; j++) {
			
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			int number3 = sc.nextInt();
			
				if((number1<number2)&& (number1<number3) ) {
					System.out.print(number1+" ");
				}
				else if((number2<number3)&& (number2<number1) ) {
					System.out.print(number2+" ");
				}
				else {
					System.out.print(number3+" ");
				}
			
			
		}
		
		sc.close();
		
		
	}
}
