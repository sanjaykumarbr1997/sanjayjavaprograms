package com.xworkz.collection.queue.priorityqueue;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		String name1 = o1.name;
		String name2 = o2.name;

		
		return name2.compareTo(name1);
	}

}
