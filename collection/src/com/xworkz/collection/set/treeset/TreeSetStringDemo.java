package com.xworkz.collection.set.treeset;

import java.util.TreeSet;

public class TreeSetStringDemo {
	

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>(new CustomComparatorString());
		
		ts.add("eco");
		ts.add("om");
		ts.add("maravante");
		ts.add("kandla");
		ts.add("apsara");
		
		
		System.out.println(ts);

	}


}
