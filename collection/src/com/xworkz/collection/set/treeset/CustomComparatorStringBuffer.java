package com.xworkz.collection.set.treeset;

import java.util.Comparator;

public class CustomComparatorStringBuffer implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		return o2.compareTo(o1);
	}
	
	

}
