package com.xworkz.collection.queue.priorityqueue;

import java.util.Comparator;

public class CustomComparatorString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}

		
		

	

}
