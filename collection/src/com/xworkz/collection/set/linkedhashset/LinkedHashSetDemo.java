package com.xworkz.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet <String> lhs = new LinkedHashSet<>();
		lhs.add("petrol");
		lhs.add("diesel");
		lhs.add("white keroscene");
		lhs.add("crude oil");
		lhs.add("crude oil");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
	}

}
