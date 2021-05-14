package com.xworkz.assertion;

public class AssertionDemo {

	public static void main(String[] args) {
		
		int age = 25;
		assert age>=18 :"cant vote";
		
		//works only when u add -ea(enable assertions) argument in run configuration
		

	}

}
