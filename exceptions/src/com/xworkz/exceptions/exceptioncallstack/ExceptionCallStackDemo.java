package com.xworkz.exceptions.exceptioncallstack;

public class ExceptionCallStackDemo {
	
	static void divide(Integer i, Integer j) {
		System.out.println(i/j);
	}
	
	static void computeDiv(Integer i, Integer j) {
		divide(i,j);
	}

	public static void main(String[] args) {
		System.out.println("Main started....");
		
		try {
			computeDiv(5,0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception caught");
			ae.printStackTrace();
		}
		System.out.println("Main ended");
		
		

	}

}
