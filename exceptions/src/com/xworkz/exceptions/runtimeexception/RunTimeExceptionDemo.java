package com.xworkz.exceptions.runtimeexception;

public class RunTimeExceptionDemo {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
		boolean res = str.isEmpty();
		System.out.println(res);
		System.out.println(str+"hello");
		}
		
		catch(NullPointerException np){
			System.out.println("caught exception");
			np.printStackTrace();
			
			System.out.println("remaining code gets executed");
			
		}
	}

}
