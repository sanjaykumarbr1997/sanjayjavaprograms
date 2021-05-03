package com.xworkz.parsing;

public class ParsingDemo {

	public static void main(String[] args) {
		
		String sa = "22";
		String sb = "33";
		System.out.println("sa + sb :" +(sa+sb));
		
		int i = Integer.parseInt(sa);
		int j = Integer.parseInt(sb);
		
		System.out.println("i +j:"+ (i+j));
		
		String bv = "true";
		System.out.println(Boolean.parseBoolean(bv));
		
		
	}

}
