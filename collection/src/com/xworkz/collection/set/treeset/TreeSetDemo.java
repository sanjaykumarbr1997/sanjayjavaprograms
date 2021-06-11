package com.xworkz.collection.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(6);
		ts.add(1);
		ts.add(3);
		ts.add(4);
		ts.add(7);
		ts.add(8);
		
		System.out.println(ts);
	}

}
