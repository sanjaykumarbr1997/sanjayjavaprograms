package com.xworkz.collection.set.treeset;

import java.util.TreeSet;

public class CustomTreeSet {

	public static void main(String[] args) {
	
		Employee tejas = new Employee("e001","Tejas",40000d);
		Employee sanjay = new Employee("e002","Sanjay",30000d);
		Employee namratha = new Employee("e003","Namratha",50000d);
		
		TreeSet<Employee> set = new TreeSet<>(new EmployeeComparator());
		set.add(tejas);
		set.add(sanjay);
		set.add(namratha);
		
		
		for(Employee e : set) {
			System.out.println(e);
		}
		
		
	}

}
