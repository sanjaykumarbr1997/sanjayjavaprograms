package codeabbey;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) {
		
		System.out.println("Enter name");
		Scanner punk = new Scanner(System.in);
		System.out.println("name:"+punk.nextLine());
		punk.close();

	}

}
