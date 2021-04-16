package com.xworkz.objectclass.clone;

public class ClockDemo {

	public static void main(String[] args) {
		Clock clock1 = new Clock("Digital","Ajantha");
		Clock clock2 = new Clock("Analog","HMT");
		Clock clock3 = null;
		
		System.out.println(clock1);
		System.out.println(clock2);
		clock1 = clock2;
		
		try {
			clock3 = (Clock) clock2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("-------------------");
		System.out.println(clock2);
		System.out.println(clock3);

	}

}
