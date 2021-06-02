package com.xworkz.collection.set.treeset;

import java.util.TreeSet;


public class TreeSetWithStringBuffer {

	public static void main(String[] args) {
		
		TreeSet<StringBuffer> ts = new TreeSet<>();
		
		ts.add(new StringBuffer("eco"));
		ts.add(new StringBuffer("om"));
		ts.add(new StringBuffer("maravante"));
		ts.add(new StringBuffer("kandla"));
		ts.add(new StringBuffer("apsara"));
		
		
		System.out.println(ts);

	}

}
