package assignments.doubt;
import java.util.Scanner;

public class Diamond {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter no of rows required to print");
	System.out.println("Note: No of rows should be greater than 2 and is a odd number");
	int numberOfLines = scanner.nextInt();
		

	int row = (numberOfLines+5)/2;
		for(int i=1;i<=row-2;i++) {
			for(int j=1;j<=row-i-2;j++) {
				System.out.print("&"+" ");
			}
			
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*"+" ");
				
			}
			for(int j=1;j<=row-i-2;j++) {
				System.out.print("&"+" ");
			}
			System.out.println();
			
			
		}
		
		for(int i=row-3;i>=1;i--) {
			for(int j=1;j<=row-i-2;j++) {
				System.out.print("&"+" ");
			}
			
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*"+" ");
				
			}
			
			for(int j=1;j<=row-i-2;j++) {
				System.out.print("&"+" ");
			}
			System.out.println();
			
		}
		
		
		scanner.close();
		
	}


	
}